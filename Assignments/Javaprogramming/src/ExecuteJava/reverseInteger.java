package ExecuteJava;

public class reverseInteger {

	public static void main(String[] args) {
		// Reverse a number
		
		int num = 234567;
		int reverse = 0;
		
		while(num!=0) {
			int digit = num%10;                // get last digit
			reverse = reverse * 10 + digit ;   // build reversed number
			num = num/10;					   // remove last digit
		}
		System.out.println("Reversed Number: " + reverse );
		
		
		// Reverse a String using while
		
		/*
        
        
        int i = str.length() - 1;
        
        while (i >= 0) {
            rev = rev + str.charAt(i);
            i--;
        } 
        System.out.println("Reversed String: " + rev); */
        
        
    	// Reverse a String using for loop
		
		String str = "Testing";
		String rev = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);  // add each character in reverse order
        }

        System.out.println("Reversed String: " + rev);
	}

}
