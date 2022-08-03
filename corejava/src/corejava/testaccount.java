package corejava;

import java.util.Scanner;

class account{
	 int acc_no;
	 String name;
	 float amount;
	 
	 void insert(int no, String na, float amt)
	 {
		 acc_no = no;
		 name = na;
		 amount = amt;
	 }
	 void display() {
		 System.out.println(acc_no+ " " + name +" " +amount);
	 }
	 
	 void deposite(float amt) {
		 amount = amount+ amt;
		 System.out.println("the amount you have deposited is" +amt);
		 
	 }
	 void withdraw(float amt) {
		 if(amount < amt) {
			 System.out.println("insufficient balance");
		 }
		 else {
			 amount = amount-amt;
			 System.out.println("the amount you have withdrwn is" +amt);
				
			 }
	 }
	 
		 
	void checkBalance() {
		System.out.println("your remaining balance is:" +amount);

			 
		 }
		 
	 }
	
public class testaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account a= new account();
		a.insert(12345, "mohammed fahad", 10000);
		a.display();
		
		a.deposite(5000);
		a.checkBalance();
		
		a.withdraw(8000);
		a.checkBalance();

	}

}
