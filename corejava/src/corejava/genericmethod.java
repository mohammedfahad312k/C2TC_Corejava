package corejava;
import java.util.*;

public class genericmethod {
	<T>void methodgen(T var1) {
		System.out.println("the value passed is of type" +var1.getClass().getSimpleName());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Genericmethod gm=new Genericmethod();
	gm.methodgen("hello world");
	gm.methodgen(223);

	}

}
