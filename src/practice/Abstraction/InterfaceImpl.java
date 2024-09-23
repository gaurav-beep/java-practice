package practice.Abstraction;

public class InterfaceImpl implements AbstractInterface{

	@Override
	public void normalMethod() {
		System.out.println("normal method");
	}

	@Override
	public void abstractMethod() {
		System.out.println("abstract method");
	}
	public static void staticMethod() {
		System.out.println("modified static method");
	}
public static void main(String[] args) {
	InterfaceImpl obj = new InterfaceImpl();
	obj.abstractMethod();
	obj.defaultMethod();
	InterfaceImpl.staticMethod();
	System.out.println("number : "+InterfaceImpl.number);
	System.out.println("name : "+AbstractInterface.name);
}
}
