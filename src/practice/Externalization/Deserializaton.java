package practice.Externalization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializaton {
public static void main(String[] args) {
	try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student.txt"))){
		Student student = (Student)in.readObject();
		System.out.println("Student : "+student);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
