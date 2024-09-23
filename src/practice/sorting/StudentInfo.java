package practice.sorting;

public class StudentInfo implements Comparable<StudentInfo> {
private String name;
private int age;
private int dob;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getDob() {
	return dob;
}
public void setDob(int dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", dob=" + dob + "]";
}
@Override
public int compareTo(StudentInfo o) {
	return this.age-o.age;
}
public StudentInfo(String name, int age, int dob) {
	super();
	this.name = name;
	this.age = age;
	this.dob = dob;
}

}
