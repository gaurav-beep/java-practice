package practice.Abstraction;

public abstract  class AbstractClass {
	static int age;
	String name;
	AbstractClass(){
//		this.age=age;
//		this.name=name;
		System.out.println("constructor inside abstract class");
	}
abstract void abstractMethod();
static void staticMethod() {
	System.out.println("static method");
}
}
