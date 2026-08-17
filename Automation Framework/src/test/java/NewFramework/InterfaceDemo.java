package NewFramework;

interface Shape {
	
	int length =10;  // Final and Static methods 
	int width =20;   // Final and Static methods 
	
	void circle();
	
	default void square() {
		System.out.println("this is square -- default method");
	}
	
	static void rectangle() {
		System.out.println("this is rectangle -- default method");
	}
}

public class InterfaceDemo implements Shape {
	
	public void circle() {
		System.out.println("this is Circle - abstract Method");
	}

	public static void main(String[] args) {
	
		// Scenario 1
	    //InterfaceDemo idobj = new InterfaceDemo();
		//idobj.circle();  // abstract method
		//idobj.square();  // default method
		//Shape.rectangle();  // static method can directly access from interface 
		
		
		// Scenario 2 
		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();  // static method can directly access from interface
		
		System.out.println(Shape.length * Shape.width);	
	

	}

}
