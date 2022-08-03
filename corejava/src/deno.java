import java.util.*;

public class deno {
	
	public class ThreadA {
	    public static void main(String[] args){
	       Thread th= new Thread();
	        th.start();
	    
	        synchronized(th){
	            try{
	                System.out.println("Waiting for b to complete...");
	                th.wait();
	            }catch(InterruptedException e){
	                e.printStackTrace();
	            }
	 
	            System.out.println("Total is: " +th.getName());
	        }
	    }
	}
	 
	class ThreadB extends Thread{
	    int total;
	    @Override
	    public void run(){
	        synchronized(this){
	            for(int i=0; i<100 ; i++){
	                total += i;
	            }
	            notify();
	        }
	    }
	}
}

	     