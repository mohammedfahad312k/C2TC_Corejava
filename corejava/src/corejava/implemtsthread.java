package corejava;
import java.util.*;
class demo1 implements Runnable{
	public void run() {
System.out.println("banking is started");
		
		System.out.println("enter the account number");
		Scanner sc= new Scanner(System.in);
		int acc=sc.nextInt();
		
		System.out.println("enter the password");
		int pwd=sc.nextInt();
		
		System.out.println("collect your cash");
		System.out.println("banking is ended");
	
	}
}

class demo implements Runnable {
	public  void run() {
		try {
		System.out.println("printing is started");
		for(int i=65;i<70;i++)
			
		{
			System.out.println((char)i);
			Thread.sleep(5000);
		}
		}
		
		catch(Exception e)
		{
			System.out.println("exception caught");
		}
		System.out.println("printing is ended");
	}

	
}

class apple3 implements Runnable{
	public void run() {
		try {
			System.out.println("addition is started");
			int a=10;
			int b=20;
			int c= a+b;
			System.out.println(c);
			Thread.sleep(5000);
		}
		catch(Exception f)
		{
			System.out.println("exception is caught");
		}
		System.out.println("addition is ended");
	
		
	}

	
	}

	

}

public class implemtsthread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		apple1 a1=new apple1();
		apple2 a2 = new apple2();
		apple3 a3= new apple3();
		
		Thread t1= new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		t1.start();
		t2.start();
		t3.start();

	}

}
