package practice.fileReading;

import java.io.FileOutputStream;

public class FileWriting {
public static void main(String[] args) {
	String filePath = "Person.txt";
	try(FileOutputStream fos = new FileOutputStream(filePath)){
		fos.write("hello world".getBytes());
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
