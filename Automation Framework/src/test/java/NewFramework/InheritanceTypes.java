package NewFramework;

class A{
	int a =100;
	void display() {
		System.out.println(a);
	}
}
class B extends A{
	int b =200;
	void show() {
		System.out.println(b);
	}
}

class C extends B{
	int c =300;
	void print() {
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		
		C bobj = new C();
	    bobj.a=100;
	    bobj.b=200;
	    bobj.c=300;
	    
	    bobj.display();
	    bobj.show();
	    bobj.print();
		
	}

}
