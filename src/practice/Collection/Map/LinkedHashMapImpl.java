package practice.Collection.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapImpl {
public static void main(String[] args) {
	// store data in (key,value) pair,maintain order,allow single null key and multiple null values
	LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
	linkedHashMap.put(null, null);
	linkedHashMap.put("name", "gaurav");
	linkedHashMap.put("age", "22");
	linkedHashMap.put("country", "india");
	
	// iterating options same as hashmap
}
}
