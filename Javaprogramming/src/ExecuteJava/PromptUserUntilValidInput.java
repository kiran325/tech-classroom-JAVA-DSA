package ExecuteJava;

import java.util.Scanner;

public class PromptUserUntilValidInput {

	public static void main(String[] args) {
		// Prompt User Until Valid Input
		
		Scanner sc = new Scanner(System.in);
		String input;

		do {
		    System.out.print("Enter 'yes' to continue: ");
		    input = sc.nextLine();
		} while (!input.equalsIgnoreCase("yes"));

		System.out.println("Thank you! Proceeding...");

	}

}
