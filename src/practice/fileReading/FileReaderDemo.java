package practice.fileReading;

import java.io.FileReader;

public class FileReaderDemo {
public static void main(String[] args) throws Exception {
	FileReader fileReader = new FileReader("Person.txt");
	int data;
	while((data=fileReader.read())!=-1) {
		System.out.print((char)data);
	}
	fileReader.close();
}
}
