package practice.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {
public static void main(String[] args) {
	// prevent duplicates,sort list,prevent null
	Set<String> treeSet = new TreeSet<>();
	//treeSet.add(null);
	treeSet.add("India");
	treeSet.add("USA");
	treeSet.add("UK");
	treeSet.add("Australia");
	
	System.out.println("treeSet : "+treeSet);
	
	// more iteration we use iterator,for loop,for each,stream api
}
}
