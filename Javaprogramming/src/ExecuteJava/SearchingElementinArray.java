package ExecuteJava;

public class SearchingElementinArray {

	public static void main(String[] args) {

		// Searching Element in array using boolean and for loop (Linear Search)
		
		int a[]= {10,20,30,40,50};
		int search_element = 20;
		boolean search_status = false;
		
/*
		
		for(int i=0;i<=a.length-1;i++) {
			
			if (a[i]==search_element) {
				System.out.println("Element Found");
				search_status = true;
				break;
			}
		}
		if(search_status==false) {
			System.out.println("Element Not Found");
		}
		
*/
		
		// Searching Element in array using boolean and for each loop (Linear Search)
		
		for(int x:a) {
			if (x==search_element) {
				System.out.println("Element Found");
				search_status = true;
				break;
		    }
		}
			
			if(search_status==false) {
				System.out.println("Element Not Found");
		}
	}

}
