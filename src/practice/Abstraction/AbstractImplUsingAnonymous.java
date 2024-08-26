package practice.Abstraction;

public class AbstractImplUsingAnonymous {
public static void main(String[] args) {
	AbstractClass obj = new AbstractClass(22,"Gaurav") {

		@Override
		void abstractMethod() {
			System.out.println("abstract method");
		}
		
	};
	obj.abstractMethod();
	AbstractClass.staticMethod();
	System.out.println(AbstractClass.age+":"+obj.name);
}
}
