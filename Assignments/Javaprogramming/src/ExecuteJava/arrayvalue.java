package ExecuteJava;

public class arrayvalue {

	public static void main(String[] args) {
		// print multi dimentional array 
		
		int a[][]= { {0,1,4},{2,3,6},{4,5,5},{6,7,0} };
		
		// using for loop 
		
		for(int r=0;r<=a.length-1;r++) {
			for(int c=0;c<=a[r].length-1;c++) {
				System.out.print(a[r][c]+ " ");
			}
			System.out.println();
		}
	}

}
