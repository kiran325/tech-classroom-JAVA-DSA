package ExecuteJava;

public class RetryAPICallUntilValidResponse {

	public static void main(String[] args) {
		
		// Retry API Call Until Valid Response 
		
		int retry = 0;
		boolean isSuccess = false;

		do {
		    System.out.println("Calling API... attempt: " + (retry + 1));
		    // Simulate API response
		    if (retry == 2) {
		        isSuccess = true;
		        System.out.println("Received valid response!");
		    } else {
		        System.out.println("Invalid response, retrying...");
		    }
		    retry++;
		} while (!isSuccess && retry < 3);
		
	}

}
