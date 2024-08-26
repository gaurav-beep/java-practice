package practice.inner_class;

public class Anonymous {
 public static void main(String[] args) {
	 AnonymousClass obj = new AnonymousClass() {
		 public void AnonymousMethod() {
			 System.out.println("Anonymous method");
		 }
	 };
	 obj.AnonymousMethod();
}
}

interface AnonymousClass{
	void AnonymousMethod();
}
