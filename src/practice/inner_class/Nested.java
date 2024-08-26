package practice.inner_class;

public class Nested {
	public static void main(String[] args) {
		NestedOuter outer = new NestedOuter();
		outer.defaultMethod();
		NestedOuter.staticMethod();
		NestedOuter.NestedInner.staticMethod();
		NestedOuter.NestedInner inner = new NestedOuter.NestedInner();
		inner.defaultMethod();
	}
}
class NestedOuter{
	void defaultMethod() {
		System.out.println("default method");
	}
	static void staticMethod() {
		System.out.println("static method");
	}
	static class NestedInner{
		void defaultMethod() {
			System.out.println("default method");
		}
		static void staticMethod() {
			System.out.println("static method");
		}
	}
}
