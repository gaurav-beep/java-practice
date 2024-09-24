package practice.java_8_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	List<Integer> even = list.stream().filter(element->element/2==0).collect(Collectors.toList());
	List<Integer> sequare = list.stream().map(element->element*element).collect(Collectors.toList());
	int sum = list.stream().reduce(0, (a,b)->a+b);
	System.out.println("even list : "+even);
	System.out.println("sequare list : "+sequare);
	System.out.println("sum : "+sum);
}
}
