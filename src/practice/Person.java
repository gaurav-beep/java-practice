package practice;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String age;
    private String city;

    public Person(String name, String age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
    }
}
