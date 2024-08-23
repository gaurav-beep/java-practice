package practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Person.txt"))) {
            Person person = (Person) in.readObject();
            System.out.println("Deserialized Person: " + person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
