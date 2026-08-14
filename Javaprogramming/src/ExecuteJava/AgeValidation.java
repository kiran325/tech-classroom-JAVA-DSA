package ExecuteJava;

public class AgeValidation {

	public static void main(String[] args) {
		// Validate a person age is above 18, eligible for vote else not eligible 
		
//		int a[][] = new int [0][0];
//		
//		a[0][0]= 100;
//		a[0][1]= 200;
//		
//		System.out.println(a[0][1]);
		
		int person_age = 20;
		if(person_age>18) {
			System.out.println("Person is eligible for vote");
		}
		else{
			System.out.println("Person is not eligible for vote");
		}
		
	}
	
}
