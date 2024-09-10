package practice.fileReading;

import java.io.FileInputStream;

public class FileReading {
public static void main(String[] args) {
	System.out.println("intailization");
	String filePath = "D:/download/fileInput.txt";
	try(FileInputStream fis = new FileInputStream(filePath)){
		while(fis.read()!=-1) {
			System.out.print(fis.read()+" ");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
