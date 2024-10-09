package practice.fileReading;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
public static void main(String[] args) throws Exception {
	BufferedReader bufferedReader = new BufferedReader(new FileReader("Person.txt"));
	int data;
	while((data=bufferedReader.read())!=-1) {
		System.out.print((char)data);
	}
	bufferedReader.close();
}
}
