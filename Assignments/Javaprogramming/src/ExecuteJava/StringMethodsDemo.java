package ExecuteJava;

public class StringMethodsDemo {

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
		
		String text = "  Automation Testing  ";
        String text2 = "automation testing";
        String csv = "one,two,three";

        System.out.println("========= BASIC STRING INFO =========");
        System.out.println("Original String: '" + text + "'");
        System.out.println("Length: " + text.length());
        System.out.println("Character at index 5: " + text.charAt(5));
        System.out.println("Trimmed String: '" + text.trim() + "'");

        System.out.println("\n========= COMPARISON METHODS =========");
        System.out.println("equals(): " + text.equals(text2));                  // false
        System.out.println("equalsIgnoreCase(): " + text.trim().equalsIgnoreCase(text2)); // true

        System.out.println("\n========= SEARCH & CHECK METHODS =========");
        System.out.println("contains('Test'): " + text.contains("Test"));       // true
        System.out.println("startsWith('  Auto'): " + text.startsWith("  Auto")); // true
        System.out.println("endsWith('ing  '): " + text.endsWith("ing  "));     // true
        System.out.println("indexOf('t'): " + text.indexOf('t'));               // 4
        System.out.println("lastIndexOf('t'): " + text.lastIndexOf('t'));       // 18

        System.out.println("\n========= CASE CONVERSION =========");
        System.out.println("toUpperCase(): " + text.toUpperCase());
        System.out.println("toLowerCase(): " + text.toLowerCase());

        System.out.println("\n========= SUBSTRING EXAMPLES =========");
        System.out.println("substring(2): '" + text.substring(2) + "'");
        System.out.println("substring(2, 12): '" + text.substring(2, 12) + "'");

        System.out.println("\n========= REPLACE METHODS =========");
        System.out.println("replace('A', 'E'): " + text.replace('A', 'E'));
        System.out.println("replace(\"Testing\", \"QA\"): " + text.replace("Testing", "QA"));

        System.out.println("\n========= SPLIT METHOD =========");
        String[] parts = csv.split(",");
        for (String part : parts) {
            System.out.println("Split part: " + part);
        }

        System.out.println("\n========= IS EMPTY / IS BLANK =========");
        String empty = "";
        String blank = "   ";
        System.out.println("empty.isEmpty(): " + empty.isEmpty()); // true
        System.out.println("blank.isBlank(): " + blank.isBlank()); // true (Java 11+)

        System.out.println("\n========= CONCATENATION =========");
        String greet = "Hello".concat(" World");
        System.out.println("concat(): " + greet);

        System.out.println("\n========= TO CHAR ARRAY =========");
        char[] chArray = text.trim().toCharArray();
        for (char c : chArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("\n========= VALUE OF =========");
        int num = 123;
        String converted = String.valueOf(num);
        System.out.println("Converted int to String: " + converted);
        System.out.println("Now concatenated: " + converted + "45"); // 12345

        System.out.println("\n========= SUMMARY COMPLETE =========");
		
	}

}
