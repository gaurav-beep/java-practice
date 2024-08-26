package practice.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapImpl {
public static void main(String[] args) {
	// store data in (key,value) pair,all single null key and any number of null values, order not prevented
	Map<String,String> hashMap = new HashMap<>();
	hashMap.put(null, null);
	hashMap.put("name", "gaurav");
	hashMap.put("age", "22");
	hashMap.put("country", "India");
	System.out.print("foreach using entryset : ");
	for(Map.Entry<String,String> entry:hashMap.entrySet()) {
		System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
	}
	System.out.println();
	System.out.print("foreach using keyset : ");
	for(String key:hashMap.keySet()) {
		System.out.print(key+"-"+hashMap.get(key)+" ");
	}
	System.out.println();
	System.out.print("foreach using values : ");
	for(String value:hashMap.values()) {
		System.out.print(value+" ");
	}
	System.out.println();
	System.out.print("iterator using entryset : ");
	Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
	while(iterator.hasNext()) {
		Entry<String, String> data = iterator.next();
		System.out.print(data.getKey()+"-"+data.getValue()+" ");
	}
	System.out.println();
	System.out.print("using lambda foreach : ");
	hashMap.forEach((key,value)->{
		System.out.print(key+"-"+value+" ");
	});
}
}
