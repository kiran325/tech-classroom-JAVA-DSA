package NewFramework;

public class Encap {
	
	private String username;

    public void setUsername(String username){

        this.username=username;
    }

    public String getUsername(){

        return username;
    }

public static void main(String[] args) {
		
		Encap u=new Encap();
		u.setUsername("Admin");
		System.out.println(u.getUsername());

	}

}
