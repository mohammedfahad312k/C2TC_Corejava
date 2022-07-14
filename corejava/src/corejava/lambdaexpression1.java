package corejava;
interface Runnable{
	public void run(int carspeed);
}

public class lambdaexpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed =100;
		//lambda expression
		Runnable r=(carspeed)->{System.out.println("the speed of the car" +speed);
		};
		r.run(speed);

	}
}
