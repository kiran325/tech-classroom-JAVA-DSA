package ExecuteJava;

import java.util.Arrays;

public class SortingElementinArray {

	public static void main(String[] args) {
		// Sorting Element in Array using to string and sort methods 
		
		int a[]= {100,400,600,300,200};
		
		System.out.println("Before sorting Array......");
		System.out.println(Arrays.toString(a));  // [100,400,600,300,200]
		
		Arrays.sort(a);
		
		System.out.println("After sorting Array......");
		System.out.println(Arrays.toString(a));  // [100,200,300,400,600]
				
	}

}
