package corejava;
import java.util.*;
import java.util.stream.Stream;

public class streamreduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> newlist= new ArrayList<Integer>();
newlist.add(100);
newlist.add(120);
newlist.add(150);
System.out.println(newlist);

Stream<Integer>stream= newlist.stream();
Optional<Integer> sum= stream.reduce(Integer::sum);
System.out.println("the sum is" +" "+sum.get());

	}

}
