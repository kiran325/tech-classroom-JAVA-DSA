package ExecuteJava;

public class Loginattempts {

	public static void main(String[] args) {
		// Retry Login Until Success
		
		boolean loginSuccess = false;
		int attempt = 1;

		do {
		    System.out.println("Attempt" + attempt + ": Trying to log in...");
		    // Simulate login check
		    if (attempt == 3) {
		        loginSuccess = true; // Success on 3rd attempt
		        System.out.println("Login successful!");
		    } else {
		        System.out.println("Login failed, retrying...");
		    }
		    attempt++;
		} while (!loginSuccess && attempt <= 3);

	}

}
