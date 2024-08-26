package practice.Abstraction;

public interface AbstractInterface {
int number=23;
static String name="gaurav";
void normalMethod();
static void staticMethod() {
	System.out.println("static method");
}
default void defaultMethod() {
	System.out.println("default method");
}
abstract void abstractMethod();
}
