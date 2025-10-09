package ExecuteJava;

public class LengthOfString {

	public static void main(String[] args) {
		// Return length of String(number of characters)
		
		String s = "welcome java";
		System.out.println(s.length());
		
		// Concat() - Joining Strings
		
		String s1= "welcome";
		String s2= "welcome to java";
		String s3= "welcome to java automation";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));
	}

}
