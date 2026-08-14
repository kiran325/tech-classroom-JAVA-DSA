package ExecuteJava;

public class smallNumber {

	public static void main(String[] args) {
		// Find smallest Number 
		
		int a=23, b=7, c=9;
		
		if(a<b && a<c) {
			System.out.println("A is Smallest Number "+ a);
		}
		else if(b<c && b<a) {
			System.out.println("B is Smallest Number "+ b);
		}
		else {
			System.out.println("C is Smallest Number "+ c);
		}
		

	}

}
