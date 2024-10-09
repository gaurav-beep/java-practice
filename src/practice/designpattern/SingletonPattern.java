package practice.designpattern;

public class SingletonPattern {
	String name;
	static SingletonPattern obj;
	static SingletonPattern createObject() {
		if(obj==null) {
			obj = new SingletonPattern();
		}
		return obj;
	}
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		SingletonPattern obj1 = SingletonPattern.createObject();
		obj1.setName("gaurav");
		System.out.println(obj1.getName());
	}
}
