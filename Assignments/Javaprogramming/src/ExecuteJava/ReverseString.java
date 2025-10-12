package ExecuteJava;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String using for loop 
		
		String str="Hello World";
		String reverseString = "";
		for(int i=str.length()-1;i>=0;i--) {
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println("Reversed String: " + reverseString );
		
		// Using String Builder method 
		
		String str1 = "WelcomE";
		String reverseStr = new StringBuilder(str1).reverse().toString();
		System.out.println("Reverse String: " + reverseStr );

	}

}
