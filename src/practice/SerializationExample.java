package practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
    public static void main(String[] args) {
        CustomSerialization customPerson = new CustomSerialization("Jane", "25", "Los Angeles");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("CustomData.txt"))) {
            out.writeObject(customPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
