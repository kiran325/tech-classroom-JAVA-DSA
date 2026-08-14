package NewFramework;

public class RefFramework {

	public static void main(String[] args) {
		String str = "aaaabbbbccccegh";
		for(int i=0;i<str.length();i++) {
			int count =0;
			for (int j=0;j<str.length();i++) {
				if (str.charAt(i)==str.charAt(i)) {
					count++;
				}
			}
			
			if(count==1) {
				System.out.println("First Non-Repeated Character : "+ str.charAt(i));
				break;
			}
			
		}

	}

}

/*  
		Outer loop (i) → Picks one letter.
		Inner loop (j) → Counts how many times that letter appears in the whole string.
		If the count is 1, print it and stop.
 */

