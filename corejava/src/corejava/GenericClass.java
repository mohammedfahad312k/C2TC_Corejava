package corejava;
import java.util.*;


public class GenericClass<T> {
	GenericClass()
	{
		System.out.println("the generic class is decleard now. you can use it well");
	}
	public void methodGeneric(T obj)
	{
	System.out.println("the type of object that this class contain is"  +obj.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GenericClass<Integer> gs= new GenericClass<>();
Integer a= 5;
gs.methodGeneric(a);

GenericClass<String>gs1= new GenericClass<>();
String s= "welcome";
gs1.methodGeneric(s);

	}

}
