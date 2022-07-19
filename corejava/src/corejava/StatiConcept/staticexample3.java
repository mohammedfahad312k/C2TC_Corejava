package corejava.StatiConcept;

public class staticexample3 {
	static int a, b, c;
	
	static {
		System.out.println("1st static block");
		a=10;b=20;c=30;
	}
	static {
		System.out.println("2nd static block");
		System.out.println(a+" " +b+ " " +c);
	}
	static {
		System.out.println("3rd static block");
	}
	
	{
		System.out.println("non static block");
	}
	{
		System.out.println("2nd non static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//staticexample3 sx= new staticexample3();
	}

}