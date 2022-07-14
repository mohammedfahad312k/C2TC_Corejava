package corejava;
import java.util.*;
import java.util.stream.Stream;

public class MapStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>fruit=new ArrayList<String>();
		fruit.add("APPLE");
		fruit.add("BANANA");
		fruit.add("MANGO");
		Stream<String>stream=fruit.stream();
		Stream<String> stringStream=stream.map((value)->{return value.toLowerCase();});
		stringStream.forEach(System.out::println);
		}

	}

