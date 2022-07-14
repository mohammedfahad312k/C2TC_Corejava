package corejava;
import java.util.*;
import java.util.stream.Collectors;

public class streamfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number= new ArrayList<Integer>();
		number.add(100);
		number.add(110);
		number.add(120);
		number.add(150);
		List<Integer>newlist= number.stream().filter(n->n>110).collect(Collectors.toList());
		newlist.add(234);
		System.out.println(newlist);
		

	}

}
