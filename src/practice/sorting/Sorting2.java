package practice.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting2 {
public static void main(String[] args) {
	List<StudentInfo> list = new ArrayList<>();
	list.add(new StudentInfo("Gaurav",22,2002));
	list.add(new StudentInfo("Omkar",26,1998));
	list.add(new StudentInfo("Shailesh",25,1999));
	DOBCompare dobCompare = new DOBCompare();
	Collections.sort(list,dobCompare);
	System.out.println("list : "+list);
}
}

class DOBCompare implements Comparator<StudentInfo>{

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
		return o1.getDob()-o2.getDob();
	}
	
}
