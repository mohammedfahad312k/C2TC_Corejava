package corejava;
class employee{
	int id;
	String name;
	float salary;

public void insert(int i,String n, float s) {
	id=i;
	name =n;
	salary= s;
}

void display() {
	System.out.println(id+ " " +name+ " " +salary);
}
}

public class demoexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SWITCH STATEMENT
		/*int  a= 10;
		switch(a){
		case 0:
			System.out.println("given number is 10");
			break;
		case 10:
			System.out.println("given number is 2 ");
			break;
		default:
		System.out.println("given number is ");
		}*/
		
		/*String a= "expert";
		int level = 0;
		
		switch(a) {
		case "beginner": level= 1;
			break;
		case "intermidiate": level= 2;
		 break;
		case "expert": level =3;
		  break;
		  
		default: level=0;
		}
		System.out.println("your level is" +level);*/
		
		//FOR LOOP STSTEMENT
		/*for(int i = 1;i<=6;i++) {
			for(int j=6;j>=i;j--)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}*/
		
		/*for(int i = 1;i<=6;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}*/
		
		
		 /* int arr[]={12,23,44,56,78};  
		    //Printing array using for-each loop  
		    for(int i:arr){  
		        System.out.println(i);  
		    }*/
		
		
		employee e= new employee(), e1= new employee();
		
		
		e.insert(1, "fahad", 4500);
		e1.insert(2, "hadaf", 6600);
		e.display();
		e1.display();
		
	}
	
}



		
		
			

