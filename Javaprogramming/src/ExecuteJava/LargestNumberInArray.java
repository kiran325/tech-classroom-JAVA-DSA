package ExecuteJava;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// Find the Largest number in Array
		/*
		 🔎 Explanation (Line by Line):
				1.	int[] a = {10, 25, 3, 99, 45};
			→ Our input array.
				2.	int largest = a[0];
			→ Start by assuming the first element is the largest.
				3.	for (int num : a) { ... }
			→ Loop through each element in the array.
				4.	if (num > largest) { largest = num; }
			→ Compare each element with largest.
			→ If it’s bigger, update largest.
				5.	System.out.println("Largest Number: " + largest);
			→ Print the final largest number.
		 */
		
		int a[] = {10, 25, 3, 99, 45};

        int largest = a[0];  // Assume first element is the largest

        for (int num : a) {
            if (num > largest) {
                largest = num;   // Update if we find a bigger number
            }
        }

        System.out.println("Largest Number: " + largest);

	}

}
