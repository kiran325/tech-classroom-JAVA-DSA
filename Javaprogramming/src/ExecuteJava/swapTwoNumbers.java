package ExecuteJava;

public class swapTwoNumbers {

	public static void main(String[] args) {
		
		// Swapping 2 integer different methods 
		
		int a = 5;
		int b = 10;
		
		System.out.println("Before Swapping A: "+ a + " Before Swapping B: " + b);
		
		// Using temp variable coolest and safest method 
		
		int temp = a;
		a = b;
		b = temp;
		
		// Using Arithmetic Operators (Addition & Subtraction)
		
		a = a + b;  // a = 15
		b = a - b;  // b = 5
		a = a - b;  // a = 10
		
		// Using Arithmetic Operators (Multiplication & Division)
		
		a = a * b;  // a = 50
		b = a / b;  // b = 5
		a = a / b;  // a = 10
		
		// Using Bitwise XOR ( ^ )
		
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b;
		
		// Using Bitwise Swap Trick (Java 1-liner with XOR)
		
		a = a ^ b ^ (b = a);
		
		System.out.println("After Swapping A: " + a + " After Swapping B: " + b);
		

	}

}
