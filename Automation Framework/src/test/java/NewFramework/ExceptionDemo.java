package NewFramework;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Program is Started....");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		String s= null;
		
		try {
		System.out.println(100/num);
		System.out.println(s.length());
		}
		
		catch(Exception e){
			System.out.println("Invalid Data...");
			System.out.println(e.getMessage());
		}
		
	}

}
