package ExecuteJava;

public class PalindromeCheck {

	public static void main(String[] args) {
		// First reverse a String and check whether reversed String is palindrome 
		
		String str = "Malayalam";

		String revS= new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(revS)) {
			System.out.println("String is Palindrome: "+ revS);
		}
		else {
			System.out.println("String is not Palindrome");
		}

	}

}
