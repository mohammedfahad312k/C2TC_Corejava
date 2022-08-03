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

class demo2 implements Runnable {
	public void run() {
		try {
		System.out.println("printing is started");
		for(int i=65;i<70;i++)
			
		{
			System.out.println((char)i);
			Thread.sleep(2000);
		}
		}
		
		catch(Exception e)
		{
			System.out.println("exception caught");
		}
		System.out.println("printing is ended");
	}
}

class demo3 implements Runnable{
	public void run() {
		try {
			System.out.println("addition is started");
			int a=10;
			int b=20;
			int c= a+b;
			System.out.println(c);
			Thread.sleep(2000);
		}
		catch(Exception f)
		{
			System.out.println("exception is caught");
		}
		System.out.println("addition is ended");
	
		
	}
}
public class extendthread {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 d1= new demo1();
		demo2 d2= new demo2 ();
		demo3 d3= new demo3();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
	
		
		
	}

}
