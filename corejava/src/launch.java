import java.util.*;
class msword extends Thread{
	public void run() {
		Thread t1= Thread.currentThread();
		String tname= t1.getName();
		if(tname.equals("Type")) {
			typing();
		}
		else if(tname.equals("check")) {
			spellingCheck();
			
		}
		else {
			autosaving();
		}
	}



public void typing() {
	
	try {
		for(int i=0;i<5;i++)
	System.out.println("typing is happening");
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		System.out.println("exception caught");
	}
		
	}


public void spellingCheck() {
	try {
		for(int i=0;i<5;i++) 
			System.out.println("spelling checking is happending");
			Thread.sleep(2000);
		}
		catch(Exception f)
		{
			System.out.println("exception caught");
		}
	}

public void autosaving() {
	try {
		for(int i=0;i<5;i++) 
			System.out.println("automatic saving is happending");
			Thread.sleep(2000);
		}
		catch(Exception f)
		{
			System.out.println("exception caught");
		}
}
public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		msword d1 = new msword();
		msword d2 = new msword();
		msword d3 = new msword();
		
		d1.setName("type");
		d2.setName("check");
		d3.setName("save");
		d1.start();
		d2.start();
		d3.start();

	}

}
}

