package ExecuteJava;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
		// Reading And Writing Data Into Array 
		
		int a[]= new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("Enter a Value for the position "+i+": ");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Printing an Array Elements........");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	    
	}

}
