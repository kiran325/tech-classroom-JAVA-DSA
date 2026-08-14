package NewFramework;

public class HalfLoop {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};

		for (int i = 0; i < arr.length / 2; i++) {
		    System.out.println(arr[i]);
		    System.out.println(arr[arr.length - 1 - i]);
		}

		// Print middle element for odd-length array
		if (arr.length % 2 != 0) {
		    System.out.println(arr[arr.length / 2]);
		}
	
	}

}
