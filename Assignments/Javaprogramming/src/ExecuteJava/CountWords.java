package ExecuteJava;

public class CountWords {

	public static void main(String[] args) {
		// Count Words in Strings 
		
		String apiResponse = "Your KYC verification is successfully completed";
		int wordCount = apiResponse.trim().split("\\s+").length;

		if (wordCount <= 10) {
		    System.out.println("✅ Valid message length, WordsCount: "+ wordCount);
		} else {
		    System.out.println("❌ Message too long, WordsCount: "+ wordCount);
		}

	}

}
