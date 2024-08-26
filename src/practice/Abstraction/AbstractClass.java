package practice.Abstraction;

public abstract  class AbstractClass {
	static int age;
	String name;
	AbstractClass(int age,String name){
		this.age=age;
		this.name=name;
	}
abstract void abstractMethod();
static void staticMethod() {
	System.out.println("static method");
}
}
