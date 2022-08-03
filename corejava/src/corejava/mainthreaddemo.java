package corejava;

public class mainthreaddemo {
	
	
	public static void main(String[] args) 
	{
	// Create a Thread object by calling currentThread() method of class Thread.
	   Thread obj = Thread.currentThread();
	   System.out.println("Current thread is " +obj);
	   System.out.println("Name of current thread is " +obj.getName());
	   
	   obj.setName("New Thread"); // Changing name of main thread.
	   System.out.println("Name of current thread after changing name is " +obj);
	   System.out.println("Main thread existing");
	  
	}


}
