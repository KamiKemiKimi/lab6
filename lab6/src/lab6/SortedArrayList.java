package lab6;

public class SortedArrayList<T extends Comparable<T>> implements SortedList<T> {
	
    protected T[] arr;
    protected int size;

	public SortedArrayList() //makes new array list and sets size at 0
    {
		//ignore error
    	arr = (T[]) new Comparable[10];
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
		return arr[pos];
	}

	public boolean add(T item) {
		if (size == arr.length)
			grow_array();
		arr[size++] = item;
		
		//sort when there is 2 or more entries in linear time
		if (size >= 2)
		{	
			//make new array
			T[] newarr = (T[]) new Comparable[size];
			
			//double pointer method to sort
			int left = 0;
			int right = size-1;
			int i = 0;
			
			while (left <= right)
			{
				// if left is less than right
				if (arr[left].compareTo(arr[right]) < 0)
				{
					newarr[i] = arr[left++];
				}
				//if left is greater than right
				else if (arr[left].compareTo(arr[right]) > 0)
				{
					newarr[i] = arr[right--];
				}
				//equal each other = use leftmost
				else
				{
					newarr[i] = arr[left++];
				}
				i++;
			}
			arr = newarr;
		}
		
		
		
		return true;
	}
	
	private void grow_array() {
		//ignore error
		T [] new_arr = (T[]) new Comparable[arr.length * 2];
		for (int i = 0; i < arr.length; i++)
			new_arr[i] = arr[i];
		arr = new_arr;
	}

	public T remove(int index) {
		if (index < 0 || index >= size)
		{
			System.out.println("ERROR! ");
			throw new IndexOutOfBoundsException();
		}
		T removeItem = arr[index];
		for (int i = index; i < size()-1; i++)
		{
			arr[i] = arr[i+1];
		}
		size--;
		return removeItem;
	}
	
    public String toString()
    {
        String result = "";
        for(int i = 0; i < size; i++)
        {
            result = result + arr[i] + " ";
        }
        return result;
    }

}
