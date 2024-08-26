package practice.staticImpl;

public class StaticScope {
static int age=22;
String name="Gaurav";
void getName() {
	System.out.println(name+":"+age);
}
static void getAge() {
	System.out.println(age);
}
public static void main(String[] args) {
	// static method and variable  = everywhere
	// instance method and variable = we can use directly in non static method,create object to use in static methods
	StaticScope obj = new StaticScope();
	obj.getName();
	getAge();
}
}
