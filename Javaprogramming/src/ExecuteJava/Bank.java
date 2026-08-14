package ExecuteJava;

	public class Bank {
	
	    double roi() 
	    {
		
	    	return 0;
	    }
	

	class ICICI extends Bank {
	    
		double roi() 
		{
		return 2.5;
		}
	}

	class SBI extends Bank{
	
		double roi() {
		return 5.5;
		}
	}
	

public static void main(String[] args) {
	 
	 Bank bnk = new Bank();
	 System.out.println(bnk.roi());
		

	}

}
