package ExecuteJava;

public class ReverseString {

	public static void main(String[] args) {
		/* // Reverse a String using for loop 
		
		String str="Hello World";
		String reverseString = "";
		for(int i=str.length()-1;i>=0;i--) {
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println("Reversed String: " + reverseString );
		
		// Using String Builder method 
		
		String str1 = "WelcomE";
		String reverseStr = new StringBuilder(str1).reverse().toString();
		System.out.println("Reverse String: " + reverseStr );  */
		
		// using for loop and converting array into character array type 
		
		String s ="WelcomE";
		String rev="";
		
		char a[]= s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			
			rev = rev+a[i];
			
		}

		System.out.println("Reverse a String: "+rev);
	}

}
