package practice.Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetIMpl {
public static void main(String[] args) {
	// prevent duplicates elements and maintain order
	Set<String> linkedHashSet = new LinkedHashSet<>();
	linkedHashSet.add("India");
	linkedHashSet.add("USA");
	linkedHashSet.add("UK");
	linkedHashSet.add("Australia");
	linkedHashSet.add(null);
	System.out.println("linkedHashSet : "+linkedHashSet);
}
}
