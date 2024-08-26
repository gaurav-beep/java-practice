package practice.Externalization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
public static void main(String[] args) {
	Student student = new Student("Gaurav","22","Mumbai");
	try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student.txt"))){
		out.writeObject(student);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
