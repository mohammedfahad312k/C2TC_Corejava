package corejava.StatiConcept;

public class staticexample {
	static int a=10;
	static void car() {
		System.out.println("car is costly");
	}
	
	void bus() {
		System.out.println("bus speed is" +a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticexample se= new staticexample();
		se.bus();

	}

}
