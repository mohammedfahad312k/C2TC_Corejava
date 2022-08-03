package corejava;

public class stringexp {
	 int i=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s1= new String("gqt");
		String s2="gqt";
		if(s1==s2)
		{
			System.out.println("references are equals");
			
		}
		else {
			System.out.println("references are not equals");
		}*/
		
		//
		String s1= "global";
		String s2= s1+"quest";
		String s3= "global"+ "quest";
		
		System.out.println(s1==s2);
	
		String a= "qlobal";
		 String c= s1+ "  "+"quest";
		System.out.println(c);
		
		//some in-built method in String class
		
	/*String x= "RajaRammohanRoy";
	System.out.println(x.length());
	System.out.println(x.charAt(4));
	System.out.println(x.indexOf('y'));
	System.out.println(x.toLowerCase());
	System.out.println(x.toUpperCase());
	System.out.println(x.startsWith("Raja"));
	System.out.println(x.endsWith("roy"));
	System.out.println(x.contains("ohan"));*/
	
	
	//string empty
	String s= "_";
	System.out.println(s.isBlank());
	System.out.println(s.isEmpty());
	
	System.out.println();
	
	char ch[]= {'g','q','t'};
	
	String str= new String(ch);
	System.out.println(str);
	
	
	System.out.println();
	StringBuilder sb= new StringBuilder("global");
	sb.append(" "+"quest"+ " ");
	sb.append("bangalore");
	sb.append("yelehanka");
	System.out.println(sb);
	System.out.println(sb.capacity());
	
	System.out.println();
	
	StringBuffer bb= new StringBuffer(2);
	System.out.println(bb.capacity());
	
	System.out.println(bb.append("mohammed"));
	System.out.println(bb.append("fahad"));
	System.out.println(bb.capacity());
	
	System.out.println();
	
	StringBuilder sb1= new StringBuilder("global");
	StringBuilder sb2= new StringBuilder("dahaf");
	System.out.println(sb1.reverse());
	//System.out.println(sb2.reverse());
	String rev= sb1.toString();
	if(str.equals(rev))
	{
		System.out.println("prinadlome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	

	//System.out.println(sb1.equals(sb2));
	//System.out.println(sb1.toString());


	String s11 ="Sachin";
	//String ss= new String ("Sachin");
	   String ss=s.intern();
	
	   System.out.println(ss);//Sachin
	   
	   
	  char[] charArr= new char[5];
	  for(int i=0;i<charArr.length;++i)
	  {
		  charArr[i]='i';
		  System.out.println(charArr[i]+ " ");
		  
	  }
	  
	  
	  System.out.println();
	  
	  int firstArr[]= {22,33};
	  int secondArr[]= {22,33};
	  if(firstArr==secondArr){
		  System.out.println("same");
	  }
	  else
	  {
		  System.out.println("not same");
		  
	  }
	  
	  System.out.println();
	  
String name="kapil";
String se=name.concat("kiran");
//System.out.println(name.toUpperCase());
	  System.out.println(se);
	   
	}
	
	  
	  
	  public void doit() {
	  }
	  public String doit1() {
		  return "a";
	  }
	  public double doit(int x) {
		  return 1.0;
		  
	 
	}

}
