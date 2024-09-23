package practice.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting1 {
	public static void main(String[] args) {
		List<StudentInfo> list = new ArrayList<>();
		list.add(new StudentInfo("Gaurav",22,2002));
		list.add(new StudentInfo("Omkar",26,1998));
		list.add(new StudentInfo("Shailesh",25,1999));
		Collections.sort(list);
		System.out.println("list : "+list);
	}
}
