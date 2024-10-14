package practice.Inheritence;

import java.util.ArrayList;

public class AnimalInheritence {
public static void main(String[] args) {
	ArrayList<Animal> list = new ArrayList<>();
	list.add(new Dog("Tommy"));
	list.add(new Cat("Joe"));
	System.out.println(list);
}
}

class Cat extends Animal{
	String name;
	Cat(String name){
		super(name);
		this.name=name;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
}
class Dog extends Animal{
	String name;
	Dog(String name){
		super(name);
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
}
class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
}