package ExecuteJava;

public class CheckPageLoadUntilCondition {

	public static void main(String[] args) {
		// Check Page Load Until Condition : Used in automation when a page takes time to load.
		
		int checkCount = 0;
		boolean pageLoaded = false;

		do {
		    System.out.println("Checking if page loaded...");
		    // simulate check
		    if (checkCount == 2) {
		        pageLoaded = true;
		        System.out.println("Page loaded successfully!");
		    } else {
		        System.out.println("Still loading...");
		    }
		    checkCount++;
		} while (!pageLoaded && checkCount < 5);


	}

}
