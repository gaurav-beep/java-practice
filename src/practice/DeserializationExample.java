package practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("CustomData.txt"))) {
            CustomSerialization customPerson = (CustomSerialization) in.readObject();
            System.out.println("Deserialized CustomSerialization: " + customPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
