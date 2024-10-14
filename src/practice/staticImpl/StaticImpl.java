package practice.staticImpl;

public class StaticImpl {
static String name;
	static {
		name="Gaurav";
		System.out.println("name in static block : "+name);
	}
	StaticImpl(String name){
		this.name=name;
		System.out.println("name in constructur : "+name);
	}
	public static void main(String[] args) {
		StaticImpl obj = new StaticImpl("Gaurav");
	}
}
