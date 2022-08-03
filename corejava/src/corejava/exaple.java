package corejava;
import java.util.*;

import java.util.Scanner;


class demo extends Thread{
	public void run() {
		Thread t= Thread.currentThread();
		String tname = t.getName();
		if(tname.equals("bank")) {
			banking();
		}
		else if(tname.equals("printing")){
			printing();
		}
		else {
	            addition();
			
		}
	}

	public void banking() {
System.out.println("banking is started");
		
		System.out.println("enter the account number");
		Scanner sc= new Scanner(System.in);
		int acc=sc.nextInt();
		
		System.out.println("enter the password");
		int pwd=sc.nextInt();
		
		System.out.println("collect your cash");
		System.out.println("banking is ended");
	}
	
	public void printing() {
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
	
	public void addition() {
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
	
	public class exaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
demo d1= new demo();
demo d2= new demo();
demo d3 = new demo();
  Thread t1= new Thread(d1);
  Thread t2= new Thread(d2);
  Thread t3= new Thread(d3);
  
  t1.start();
  t2.start();
  t3.start();
	}

}
}

