package practice.inner_class;

public class AnonymousInnerImpl {
public static void main(String[] args) {
	AnonymousOuter.AnonymousInner obj = new AnonymousOuter.AnonymousInner() {
		@Override
		public void defaultMethod() {
			 System.out.println("default method");
		}
	};
	obj.defaultMethod();
	AnonymousOuter.AnonymousInner.staticMethod();
}
}
class AnonymousOuter{
	interface AnonymousInner{
		static void staticMethod() {
			System.out.println("static method");
		}
		void defaultMethod();
	}
}
