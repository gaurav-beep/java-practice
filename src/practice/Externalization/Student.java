package practice.Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {
private String name,age;
private String city;

public Student(String name, String age, String city) {
	super();
	this.name = name;
	this.age = age;
	this.city = city;
}
public Student() {
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
}
@Override
public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(name);
	out.writeObject(age);
	//out.writeObject(city);
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	this.name=(String) in.readObject();
	this.age=(String)in.readObject();
	//this.city=(String)in.readObject();
}

}
