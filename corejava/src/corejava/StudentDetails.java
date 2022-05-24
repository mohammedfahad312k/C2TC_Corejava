package corejava;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter your name.");
	String name = scan.nextLine();
	
	char ch= scan.next().charAt(2); 
	System.out.println("ch:"+ch);

	System.out.println("enter your age.");
	int age = scan.nextInt();
	System.out.println("enter your marks.");
	float marks1 = scan.nextFloat();
	float marks2 = scan.nextFloat();
	
	System.out.println("name is: "+name);
	System.out.println("age of "+name+" is: "+age);
	System.out.println("the marks obvtain "+name+" is in java and python:" +marks1 , marks2);
	}

}
