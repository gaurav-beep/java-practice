package practice.Abstraction;

public class AbstractImpl extends AbstractClass {
public AbstractImpl(int age, String name) {
		super(age,name);
	}
void abstractMethod() {
	System.out.println("abstract method");
}
static void staticMethod() {
	System.out.println("modified static method");
}
public static void main(String[] args) {
	AbstractImpl obj = new AbstractImpl(22,"gaurav");
	System.out.println(AbstractClass.age+":"+obj.name);
	obj.abstractMethod();
	obj.staticMethod();
}
}
