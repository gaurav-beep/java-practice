package practice.Reflection;

public class Person {
	String name;
	private String age;
	static String city;
	void defaultMethod() {
		System.out.println("default Method");
	}
	private void privateMethod() {
		System.out.println("private Method");
	}
	static void staticMethod() {
		System.out.println("static Method");
	}
	public Person(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
}
