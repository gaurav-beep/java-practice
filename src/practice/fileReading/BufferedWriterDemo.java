package practice.fileReading;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
public static void main(String[] args) throws Exception {
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Person.txt"));
	bufferedWriter.write("Omkar Kamble");
	bufferedWriter.close();
}
}
