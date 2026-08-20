package NewFramework;

public class DataConvertionMethods {

	public static void main(String[] args) {
		
		//String s= "welcome"; // can't convert into int 
		
		String d="12345";
		int sint = Integer.parseInt(d);
		System.out.println(sint);
		
		String s1 = "10";
		String s2 = "20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

	}

}
