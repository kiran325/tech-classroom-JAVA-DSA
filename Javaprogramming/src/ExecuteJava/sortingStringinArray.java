package ExecuteJava;

import java.util.Arrays;

public class sortingStringinArray {

	public static void main(String[] args) {
		
		// Sorting Strings in an Array 
		
		//char a[]= {'U','M','L','A','B','D','C'};
		
		String s[]= {"kiran", "Karan", "keerthi","kvya"};
		
		System.out.println("Before Sorting Array: "+ Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After Sorting Array: "+ Arrays.toString(s));

	}

}
