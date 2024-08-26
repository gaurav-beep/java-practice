package practice.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetImpl {
public static void main(String[] args) {
	// prevent duplicates elements but doesn't maintain order
	Set<String> hashSet=new HashSet<>();
	hashSet.add(null);
	hashSet.add("India");
	hashSet.add("USA");
	hashSet.add("UK");
	hashSet.add("Australia");
	System.out.println("hashSet : "+hashSet);
	
	// we use iterator,foreach,for,stream api to iterating elements
}
}
