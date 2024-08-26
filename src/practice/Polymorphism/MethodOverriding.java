package practice.Polymorphism;

public class MethodOverriding extends Override {
void testOverride() {
	System.out.println("modified method overriding");
}
static void staticMethod() {
	System.out.println("Modifed static method");
}
public static void main(String[] args) {
	MethodOverriding obj = new MethodOverriding();
	obj.testOverride();
	Override.staticMethod();
}
}
class Override{
	void testOverride() {
		System.out.println("method overriding");
	}
	static void staticMethod() {
		System.out.println("static method");
	}
}
