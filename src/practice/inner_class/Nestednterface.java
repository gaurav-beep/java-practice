package practice.inner_class;

public class Nestednterface {
public static void main(String[] args) {
	NestedOuterClass.NestedInnerInterface obj = new NestedOuterClass.NestedInnerInterface() {
		public void defaultMethod() {
			System.out.println("default method");
		}
	};
	obj.defaultMethod();
	NestedOuterClass.NestedInnerInterface.staticMethod();
}
}
class NestedOuterClass{
	interface NestedInnerInterface{
		void defaultMethod();
		static void staticMethod() {
			System.out.println("static method");
		}
	}
}
