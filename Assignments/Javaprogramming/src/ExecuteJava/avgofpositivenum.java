package ExecuteJava;

public class avgofpositivenum {

	public static void main(String[] args) {
		// Find average of all positive numbers 
		
		int arr[]= {-1,4,5,-2,0,-2,1};
		int sum =0;
		int count =0;
		
		for(int i=0;i<=arr.length-1;i++) {
			if (arr[i]>0) {
				sum= sum+arr[i];
				count++;
			}
		}
		if (count>0) {
			double average = (double) sum/count;
			System.out.println("Average of positive numbers is: "+ average);
		}
		else {
			System.out.println("No positive numbners in the array.");
		}
		
	}

}
