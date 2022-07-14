package corejava;

interface cube
{
	int calculate(int a);
}

public class lambdaexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		cube  c=(int a)->a*a*a;
		int result= c.calculate(x);
		System.out.println(result);
		

	}

}
