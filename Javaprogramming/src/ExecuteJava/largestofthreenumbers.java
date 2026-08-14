package ExecuteJava;

public class largestofthreenumbers {

	public static void main(String[] args) {
		// Find largest of 3 numbers
		
		int a=23, b=7, c=9;
		
		if(a>b && a>c) {
			System.out.println("A is Largest Number "+ a);
		}
		else if(b>c && b>a) {
			System.out.println("B is Largest Number "+ b);
		}
		else {
			System.out.println("C is Largest Number "+ c);
		}

	}

}
