package ExecuteJava;

public class RemoveAllJunkSpecialCharacters {

	public static void main(String[] args) {
		
		/*
        🧠 Explanation of Regex:
        	
        	^ : Negation (NOT these characters)
        	a-zA-Z : Keep lowercase and uppercase letters
        	0-9 : Keep digits
        	\\s : Keep spaces
        	[^a-zA-Z0-9] : Remove everything except letters and digits
        	[^a-zA-Z0-9\\s] : Remove everything except letters, digits, and spaces
        	\\x00-\\x7F : Remove emojis or Unicode junk
        	
         */
		
		// Remove All Junk and Special characters in String 
		
		String str = "He!!o@# W$%o^&r*l(d)_+123";
        
        // Keep only alphabets and numbers
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "");
        
        System.out.println("Original String: " + str);
        System.out.println("Cleaned String: " + cleanStr);
        

        // Keep alphabets, numbers, and spaces
        String cleanStr1 = str.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println("Cleaned String: " + cleanStr1);
        
        
        String str1 = "Hello🌍!!💻 Welcome✨123";
        // Keep only basic ASCII characters
        String cleanStr2 = str1.replaceAll("[^\\x00-\\x7F]", "");
        
        System.out.println("Cleaned String: " + cleanStr2);
        
        // Remove all whitespace in String 
        String str2 = "  Java   Programming   Language  ";
        
        // Removes all white spaces (spaces, tabs, etc.)
        String noSpaces = str2.replaceAll("\\s+", "");
        
        System.out.println("Original: '" + str + "'");
        System.out.println("No Spaces: '" + noSpaces + "'");
        
        /*
			Remove all spaces:            replaceAll("\\s+", ""):   "Hello World" → "HelloWorld"
            Remove leading/trailing:      trim() or strip():        " Hello " → "Hello"
            Replace multiple with single: replaceAll("\\s+", " "):   "Hello   World" → "Hello World"
            Remove only normal spaces:    replace(" ", ""):         "A B" → "AB"
         */
        
	}

}
