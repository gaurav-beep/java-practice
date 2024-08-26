package practice.inner_class;

public class Local {
public static void main(String[] args) {
	LocalOuter outer = new LocalOuter();
	outer.outerMethod();
	outer.localMethod();
}
}
class LocalOuter{
	void outerMethod() {
		System.out.println("outer method");
	}
	void localMethod() {
		class Inner{
			void innerMethod() {
				System.out.println("inner method");
			}
		}
		Inner inner = new Inner();
		inner.innerMethod();
	}
}
