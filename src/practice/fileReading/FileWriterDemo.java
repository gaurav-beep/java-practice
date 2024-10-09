package practice.fileReading;

import java.io.FileWriter;

public class FileWriterDemo {
public static void main(String[] args) throws Exception {
	FileWriter fileWriter = new FileWriter("Person.txt");
	fileWriter.write("Gaurav Yadav");
	fileWriter.close();
}
}
