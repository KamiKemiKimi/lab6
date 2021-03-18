package lab6;

public class tester {

	public static void main(String [] args)
	{
		System.out.println("ARRAYLIST IMPLEMENTATION");
		SortedArrayList<String> arr1 = new SortedArrayList<String>();
		
		//Initialize
		System.out.println("	Intial size: " + arr1.size());
		
		//UNCOMMENT TO CHECK FOR OUTOFBOUNDS EXCEPTION when empty
		//System.out.println(arr1.get(0));
		
		//Add
		System.out.println("		Adding \"hi\" first...");
		arr1.add("hi");
		System.out.println("		Adding \"hello\" second...");
		arr1.add("hello");
		
		//Sort
		System.out.println("	Print 'sorted' array using compareTo: " + arr1);
		
		//Size
		System.out.println("	Print size: " + arr1.size());
		
		//Get
		System.out.println("	Get index 0: " + arr1.get(0));
		
		//UNCOMMMENT TO CHECK FOR OUTOFBOUNDS EXCEPTION WHEN GETTING OUTSIDE UPPER RANGE
		//System.out.println(arr1.get(3));
		
		//UNCOMMENT TO CHECK FOR OUTOFBOUNDS EXCEPTION WHEN GETTING OUTSIDE LOWER RANGE
		//System.out.println(arr1.get(-1));
		
		//Remove
		System.out.println("		Removing \"hello\" at index 0");
		arr1.remove(0);
		
		//UNCOMMENT TO CHECK FOR OUTOFBOUNDS EXCEPTION WHEN REMOVING OUTSIDE UPPER RANGE
		//arr1.remove(10);
		
		//UNCOMMENT TO CHECK FOR OUTOFBOUNDS EXCEPTION WHEN REMOVING OUTSIDE LOWER RANGE
		//arr1.remove(-1);

		System.out.println("	Print new array: " + arr1);
		
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("LINKED LIST IMPLEMENTATION");
		SortedLinkedList<String> arr2 = new SortedLinkedList<String>();
		
		//Initialize
		System.out.println("	Intial size: " + arr2.size());
		
		//UNCOMMENT TO CHECK FOR OUTOFBOUNDS EXCEPTION when empty
		//System.out.println(arr2.get(0));
		
		//Add
		System.out.println("		Adding \"goodbye\" first...");
		arr2.add("goodbye");
		System.out.println("		Adding \"bye\" second...");
		arr2.add("bye");
		
		//Sort
		System.out.println("	Print 'sorted' array using compareTo: " + arr2);
		
		//Size
		System.out.println("	Print size: " + arr2.size());
		
		//Get
		System.out.println("	Get index 0: " + arr2.get(0));
		
		//UNCOMMMENT TO CHECK FOR OUTOFBOUNDS EXCEPTION WHEN GETTING OUTSIDE UPPER RANGE
		//System.out.println(arr2.get(3));
		
		//UNCOMMENT TO CHECK FOR OUTOFBOUNDS EXCEPTION WHEN GETTING OUTSIDE LOWER RANGE
		//System.out.println(arr2.get(-1));
		
		//Remove
		System.out.println("		Removing \"bye\" at index 0");
		arr2.remove(0);
		
		//UNCOMMENT TO CHECK FOR OUTOFBOUNDS EXCEPTION WHEN REMOVING OUTSIDE UPPER RANGE
		//arr2.remove(10);
		
		//UNCOMMENT TO CHECK FOR OUTOFBOUNDS EXCEPTION WHEN REMOVING OUTSIDE LOWER RANGE
		//arr2.remove(-1);

		System.out.println("	Print new array: " + arr2);
		
	}
}
