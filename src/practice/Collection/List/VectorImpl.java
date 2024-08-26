package practice.Collection.List;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorImpl {
public static void main(String[] args) {
	// thread safe
	Vector<String> vector = new Vector<String>();
	vector.add("India");
	vector.add("USA");
	vector.add("UK");
	vector.add("Australia");
	vector.add(null);
	
	// iterating option are same as array list and linked list
	System.out.print("Enumeration : ");
	Enumeration<String> enumeration = vector.elements();
	while(enumeration.hasMoreElements()) {
		System.out.print(enumeration.nextElement()+",");
	}
}
}
