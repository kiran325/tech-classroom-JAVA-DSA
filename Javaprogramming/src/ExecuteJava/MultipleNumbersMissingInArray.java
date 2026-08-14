package ExecuteJava;

public class MultipleNumbersMissingInArray {

	public static void main(String[] args) {
		// Find Multiple NUmber Missing in Array
		
		 int[] a = {1, 4}; 
	        int n = 5;  

	        boolean[] present = new boolean[n + 1]; // Index 0 unused

	        // Mark numbers present
	        for (int num : a) {
	            present[num] = true;
	        }

	        // Print missing numbers
	        System.out.print("Missing Numbers: ");
	        for (int i = 1; i <= n; i++) {
	            if (!present[i]) {
	                System.out.print(i + " ");
	            }
	        }

	}

}
