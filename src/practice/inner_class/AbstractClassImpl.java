package practice.inner_class;

public class AbstractClassImpl {
public static void main(String[] args) {
	AbstractClass abstractClass = new AbstractClass() {
		void abstractMethod() {
			System.out.println("abstract method");
		}
	};
	abstractClass.abstractMethod();
	abstractClass.nonAbstractMethod();
	AbstractClass.staticMethod();
}
}
abstract class AbstractClass{
	void nonAbstractMethod() {
		System.out.println("non abstract method");
	}
	abstract void abstractMethod();
	static void staticMethod() {
		System.out.println("static method");
	}
}

