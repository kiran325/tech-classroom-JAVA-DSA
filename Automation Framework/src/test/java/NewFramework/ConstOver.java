package NewFramework;

public class ConstOver {
	
	double width,height,depth;
	
	ConstOver()
	{	
		width=height=depth=0;
	}
	
	ConstOver(double w, double h, double d)
	{
		width =w;
		height =h;
		depth =d;
	}
	
	ConstOver(double len) 
	{
		width=height=depth=len;
	}
	
	double volume()
	{
		return(width*height*depth);
	}
	
	public static void main(String[] args) {
		ConstOver c= new ConstOver(10.5, 10.5, 10.5);
		System.out.println(c.volume());
	}
		
}

