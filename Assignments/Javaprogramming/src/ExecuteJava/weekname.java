package ExecuteJava;

import java.util.Scanner;

public class weekname {

	public static void main(String[] args) {
		// Display week name based on week numbers 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a weekNumber: ");
		int weekNumber = scan.nextInt();
		
		switch(weekNumber) {
		case 1 : System.out.println("1st day of week Sunday"); break;
		case 2 : System.out.println("2nd day of week Monday"); break;
		case 3 : System.out.println("3rd day of week Tuesday"); break;
		case 4 : System.out.println("4th day of week Wednusday"); break;
		case 5 : System.out.println("5th day of week Thursday");  break;
		case 6 : System.out.println("6th day of week Friday"); break;
		case 7 : System.out.println("7th day of week Saturday"); break;
		default : System.out.println("Invalid weekNumber");
		
		}
	}

}
