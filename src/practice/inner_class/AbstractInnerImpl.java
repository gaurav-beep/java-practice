package practice.inner_class;

public class AbstractInnerImpl {
public static void main(String[] args) {
	AbstractInner inner = new AbstractInner();
	AbstractInner.AbstractInnerClass obj = inner.new AbstractInnerClass() {
		@Override
		void abstractMethod() {
			System.out.println("abstract method");
			
		}
	};
	obj.abstractMethod();
}
}
class AbstractInner{
	abstract class AbstractInnerClass{
		abstract void abstractMethod();
	}
}
