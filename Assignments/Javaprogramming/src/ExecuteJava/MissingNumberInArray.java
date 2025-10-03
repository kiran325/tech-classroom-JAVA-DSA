package ExecuteJava;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// Find Missing Number in Array (Single Digit missing in array)
		
		int[] a = {1, 4, 3, 5};
        int n = 5; // Range is from 1 to 5
        
        int expectedSum = n * (n + 1) / 2;  // Formula
        int actualSum = 0;
        
        for (int num : a) {
            actualSum += num;
        }
        
        int missing = expectedSum - actualSum;
        System.out.println("Missing Number: " + missing);

	}

}
