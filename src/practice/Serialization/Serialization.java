package practice.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Gaurav", "22", "Mumbai");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Person.txt"))) {
            out.writeObject(person);
        }
    }
}
