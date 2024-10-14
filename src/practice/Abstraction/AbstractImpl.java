package practice.Abstraction;

public class AbstractImpl extends AbstractClass {
	int name,age;
//public AbstractImpl(int age, String name) {
//		super(age,name);
//	}
void abstractMethod() {
	System.out.println("abstract method");
}
static void staticMethod() {
	System.out.println("modified static method");
}
public static void main(String[] args) {
	AbstractImpl obj = new AbstractImpl();
	System.out.println(AbstractClass.age+":"+obj.name);
	obj.abstractMethod();
	AbstractImpl.staticMethod();
}
}
