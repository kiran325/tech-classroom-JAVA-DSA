package ExecuteJava;

public class EqualsToCheck {

	public static void main(String[] args) {
		// ==: Compares object references (memory addresses), not the content of the objects.
		// .equals(): Compares the actual content of the objects (if overridden in the class)
		
		String st1 = new String("Kiran");
        String st2 = new String("Kiran");
        System.out.println(st1 == st2);       // false
        System.out.println(st1.equals(st2));  // true
        
        // ✅ Explanation:
    	// s1 == s2 → ❌ false, because s1 and s2 are two different objects in memory (different references).
    	// s1.equals(s2) → ✅ true, because the content "Kiran" is the same.
        
        int a = 10;
        int b = 10;
        System.out.println(a == b);  // true
        
        // ✅ Here, == compares primitive values, not references.
        // Primitives don’t use .equals() (only objects do).
		
		String s1 = "welcome";
		String s2 = "Welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(st2));
		
		// ✅ Both are true because Java interns string literals, meaning "Test" points to the same memory in the String Pool.

		String str1 = "HelloWorld";
		String str2 = "Welcome";
		System.out.println("Length of String: "+ str1.length());
		System.out.println("HelloWorld".length());
		System.out.println(str1.concat(str2));
		System.out.println("Welcome".concat(str2));
		
		String s3 = "   Welcome   ";
		System.out.println(s3.trim());
		
		String s4 = "JAVA String";
		System.out.println(s4.charAt(0)); // return character from string based on index value
		
		System.out.println(s4.contains("J")); // contains characters or string 
		System.out.println(s4.replace('A', 'J')); // replace single/multiple(sequence) of characters in a string
		System.out.println(s4.substring(7,11)); // substring extract substring from the main string 
		
		System.out.println(s4.toUpperCase()); // WELCOME
		System.out.println(s4.toLowerCase()); // welcome
		
		String s = "abc@gmail.com";  // split() -split the string into multiple parts based on delimeter
		String a1[]= s.split("@");
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		
		
	}

}
