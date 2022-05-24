package corejava_package;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Linear Search for given number.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = scan.nextInt();
		System.out.println("Enter the "+size+" elements of Array.");
		int []arr = new int [size];
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the number to find inside the Array:");
		int num = scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("The number "+num+" is found at "+i+" position.");
				System.exit(i);
			}
		}
		System.out.println("Item not found.");
	}

}