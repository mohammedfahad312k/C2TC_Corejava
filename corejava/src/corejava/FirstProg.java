package corejava;

public class FirstProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a= 10;
		int b=0;
		 
		try {
		   int  c= a/b;
		}
		   
		catch(Exception e) {
			System.out.println(e);
		}
		
System.out.println("exception is handled");
	}*/
		  try{
			  String s= "null"; // nullpoint Exceptiom
              int a[]=new int[5];// arrayoutofbondsException    
              a[5]=30; 
              
              int b= 50/0;  // arithmeticexception
			  
             }    
                 
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                } 
		  catch(ArithmeticException e)  
          {  
           System.out.println("Arithmetic Exception occurs");  
          }  
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                }             
             System.out.println("rest of the code");    
  }  
}  

