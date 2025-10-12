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
		String s2 = "welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		// ✅ Both are true because Java interns string literals, meaning "Test" points to the same memory in the String Pool.

	}

}
