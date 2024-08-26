package practice.Abstraction;

public class InterfaceImplUsingAnonymous {
public static void main(String[] args) {
	AbstractInterface obj = new AbstractInterface() {

		@Override
		public void normalMethod() {
			System.out.println("normal Method");
			
		}

		@Override
		public void abstractMethod() {
			System.out.println("abstract method");
			
		}
	};
	obj.abstractMethod();
	obj.defaultMethod();
	AbstractInterface.staticMethod();
	System.out.println("number : "+AbstractInterface.number);
	System.out.println("name : "+AbstractInterface.name);
}
}
