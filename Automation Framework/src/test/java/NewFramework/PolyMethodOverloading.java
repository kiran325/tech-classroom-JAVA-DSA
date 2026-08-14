package NewFramework;

 class Methodlogin{
	
	String login(String username, String password) {
		System.out.println("Login using username");
		return(username+password);
	}
	
	String login(String mobile) {
		System.out.println("Login using mobile number");
		return(mobile);
	}
	
	void login(String email, int otp, boolean rememberMe) {
		System.out.println("Login using email and OTP");
	}
	
}


public class PolyMethodOverloading {

	public static void main(String[] args) {
		
		Methodlogin log = new Methodlogin();
		log.login("eno ondu", "idu eno ondu");
		log.login("9916086205");
		log.login("itskk@gmail.com", 1234, true);
	}

}
