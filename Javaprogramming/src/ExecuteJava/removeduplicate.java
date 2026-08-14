package ExecuteJava;

public class removeduplicate {
	
	public static void main(String[] args) {
		     // Remove Duplicate From sorted Array in place
		        int arr[] = {21, 35, 35, 35, 47, 47, 56, 56, 68};

		        int j = 0;
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] != arr[j]) {
		                j++;
		                arr[j] = arr[i];  // place unique element in next position
		            }
		        }

		        // Print only unique elements (till index j)
		        System.out.println("Array after removing duplicates:");
		        for (int k = 0; k <= j; k++) {
		            System.out.print(arr[k] + " ");
		        }
	}

}
