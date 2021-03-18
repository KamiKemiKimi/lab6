package lab6;

public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T> {
	protected Node<T> head;
	protected int size;
	
	static class Node<T>
	{
		T data;
		Node<T> next;
		
		public Node(T value)
		{
			data = value;
			next = null;
		}
	}
	
	public SortedLinkedList(){
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}

	public T get(int pos) {
		if (pos < 0 || pos >= size)
		{
			System.out.println("ERROR! ");
			throw new IndexOutOfBoundsException();
		}
		Node<T> curr = head;
		for(int i = 0; i < pos; i++)
		{
			curr = curr.next;
		}
		return curr.data;
	}

	public boolean add(T item) {
		
		Node<T> curr = head;
		
		
		if (head == null)
		{
			head = new Node<T>(item);
			++size;
		}
		
		else
		{
			while (curr.next != null)
			{
				curr = curr.next;
			}
			
			Node<T> new_node = new Node<T>(item);
			curr.next = new_node;
			++size;
			
		}
		
		Node<T> n = head;
		
		while (n.next != null)
			n = n.next;
		
		sort(head, n);
		
		return true;
	}
	
	//QUICKSORT
    Node<T> paritionLast(Node<T> s, Node<T> e)
    {
        if (s == e || s == null || e == null)
            return s;
 
        Node<T> pivot_prev = s;
        Node<T> curr = s;
        T pivot = e.data;
 
        
        while (s != e) {
        	//Using compareTo to find if left is less than right
            if (s.data.compareTo(pivot) < 0) {
                pivot_prev = curr;
                T temp = curr.data;
                curr.data = s.data;
                s.data = temp;
                curr = curr.next;
            }
            s = s.next;
        }
 
        //swap
        T temp = curr.data;
        curr.data = pivot;
        e.data = temp;
 
        // return prev pivot
        return pivot_prev;
    }
 
    void sort(Node<T> s, Node<T> e)
    {
        if(s == null || s == e|| s == e.next )
            return;
 
        // partition recursively
        Node<T> pivot_prev = paritionLast(s, e);
        sort(s, pivot_prev);
 
        if (pivot_prev != null && pivot_prev == s)
            sort(pivot_prev.next, e);
 
        else if (pivot_prev != null
                 && pivot_prev.next != null)
            sort(pivot_prev.next.next, e);
    }
	


	public T remove(int index) {
		if (index < 0 || index >= size)
		{
			System.out.println("ERROR! ");
			throw new IndexOutOfBoundsException();
		}
		
		if (index == 0)
		{
			Node<T> node = head;
			head = head.next;
			--size;
			return node.data;
		}
		else
		{
			Node<T> curr = head;
			for (int i = 0; i < index-1; i++)
			{
				curr = curr.next;
			}
			Node<T> node = curr.next;
			curr.next = node.next;
			--size;
			return node.data;
		}
	}
		
    public String toString()
    {
        String result = "";
        Node<T> curr = head;
        for (int i = 0; i < size; i++)
        {
        	result += curr.data + " ";
        	curr = curr.next;
        }
        return result;
    }
}
