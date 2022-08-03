import java.util.Scanner;

public class threadexp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("banking is started");
		
		System.out.println("enter the account number");
		Scanner sc= new Scanner(System.in);
		int acc=sc.nextInt();
		
		System.out.println("enter the password");
		int pwd=sc.nextInt();
		Thread.sleep(5000);
		
		System.out.println("collect your cash");
		System.out.println("banking is ended");
		
		System.out.println("printing is started");
		for(int i=65;i<70;i++)
		{
			System.out.println((char)i);
			Thread.sleep(5000);
		}
		
		System.out.println("addition is started");
		int a=10;
		int b= 20;
		int c= a+b;
		System.out.println(c);
	}

}
