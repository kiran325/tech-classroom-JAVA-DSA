package ExecuteJava;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		// Find the Smallest Number in Array 
		/*
		   🔎 Explanation (Line by Line):
				1.	int[] a = {10, 25, 3, 99, 45};
			→ Input array.
				2.	int smallest = a[0];
			→ Start by assuming the first element is the smallest.
				3.	for (int num : a) { ... }
			→ Loop through each element.
				4.	if (num < smallest) { smallest = num; }
			→ Compare each number with smallest.
			→ If smaller, update smallest.
				5.	System.out.println("Smallest Number: " + smallest);
			→ Print the final result.
		 */
		
		
		 int[] a = {10, 25, 3, 99, 45};

	        int smallest = a[0];  // Assume first element is the smallest

	        for (int num : a) {
	            if (num < smallest) {
	                smallest = num;   // Update if we find a smaller number
	            }
	        }

	        System.out.println("Smallest Number: " + smallest);

	}

}
