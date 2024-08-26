package practice.Inheritence;

public class CompositonImpl {
static Composition compostion;
CompositonImpl(){
	compostion = new Composition();
}
void mainClass() {
	System.out.println("main class");
}
public static void main(String[] args) {
	CompositonImpl obj = new CompositonImpl();
	obj.mainClass();
	compostion.dependentClass();
}
}
class Composition {
	void dependentClass() {
		System.out.println("dependent class");
	}
}
