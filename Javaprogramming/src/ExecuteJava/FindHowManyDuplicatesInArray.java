package ExecuteJava;

public class FindHowManyDuplicatesInArray {

	public static void main(String[] args) {
		// Find how many times numbers repeated in Array (Duplicates)
		
		int a[]= {10,20,30,40,50,60,70,80,90,100,11,10,10,10,20,40};
		int count = 0;
		
		for(int value : a) {
			if(value==90) {
				count++;
		}

	}
		System.out.println(count);
	}

}
