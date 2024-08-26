package practice.inner_class;

public class Member {
public static void main(String[] args) {
	Outer outer = new Outer("Gaurav");
	outer.outerMethod();
	System.out.println("name : "+outer.name);
	Outer.Inner inner = outer.new Inner("22");
	inner.innerMethod();
	System.out.println("age : "+inner.age);
}
}
class Outer{
	String name;
	void outerMethod() {
		System.out.println("outer class method");
	}
	Outer(String name){
		this.name=name;
	}
	class Inner{
		String age;
		Inner(String age){
			this.age = age;
		}
		void innerMethod() {
			System.out.println("inner class method");
		}
	}
}
