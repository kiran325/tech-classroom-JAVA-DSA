package ExecuteJava;

public class reverseInteger {

	public static void main(String[] args) {
		// Reverse a number
		
		int num = 234567;
		int reverse = 0;
		
		while(num!=0) {
			int digit = num%10;
			reverse = reverse * 10 + digit ;
			num = num/10;
		}
		System.out.println("Reversed Number: " + reverse );
	}

}
