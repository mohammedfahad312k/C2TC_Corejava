package corejava.StatiConcept;

public class staticexample2 {
	static int a= 2,b,c;  //static variable
	
	//non static variable
	int x;
	int y;
	int z;
	
	//static block
	static {
		System.out.println("static block");
		a=0; 
		b=20;
		c=30;
	}
	
	//static method()
	static void add() {
		System.out.println("static method");
		System.out.println(a+ " "+b+ " " +c );
	}
	
////////non static block
	{
		System.out.println("non static block");
		x=1; y=8; z=4;
	}
	
	//non static method()
	void disp() {
		System.out.println("non static method");
		System.out.println(a +" " +b+ " " +c);
		System.out.println(x+" "+y +" " +z );
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");

		staticexample2.add();
		staticexample2 sx= new staticexample2();
		sx.disp();
	
	}
}
