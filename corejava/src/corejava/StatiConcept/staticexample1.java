package corejava.StatiConcept;

public class staticexample1 {
	static int i= 100;
	int j= 200;
	
	static void a() {
		int a=300;
		System.out.println("pront from a");
		
		//System.out.println(super.i);
		
	}
	
	void a2() {
		System.out.println("inside a2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticexample1 ex= new staticexample1();
		ex.a2();
		staticexample1.a();
		

	}

}
