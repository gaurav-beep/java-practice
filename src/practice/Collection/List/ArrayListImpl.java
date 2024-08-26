package practice.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListImpl {
public static void main(String[] args) {
	// accessing element is faster than linkedlist
	List<String> list = new ArrayList<>();
	list.add("India");
	list.add("USA");
	list.add("UK");
	list.add("Australia");
	System.out.print("Iterator : ");
	Iterator<String> iterator = list.iterator();
	while(iterator.hasNext()) {
        String country = iterator.next();
        if(country.equalsIgnoreCase("USA")) {
            iterator.remove();
        } else {
            System.out.print(country + " ");
        }
    }
	System.out.println();
	System.out.print("For Each : ");
	for(String element:list) {
		if(list.indexOf(element)==list.size()-1)
			System.out.print(element);
		else
			System.out.print(element+",");
	}
	System.out.println();
	System.out.print("ListIterator : ");
	ListIterator<String> listIterator  = list.listIterator();
	while(listIterator.hasNext()) {
		System.out.print(listIterator.next()+" ");
	}
	System.out.println();
	System.out.print("reverse list iterator : ");
	ListIterator<String> reverse = list.listIterator(list.size());
	while(reverse.hasPrevious()) {
		System.out.print(reverse.previous()+" ");
	}
}
}
