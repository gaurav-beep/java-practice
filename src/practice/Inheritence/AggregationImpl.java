package practice.Inheritence;

public class AggregationImpl {
	String name;
	AggregationImpl(Aggregation obj){
		this.name = obj.name;
	}
	public static void main(String[] args) {
		Aggregation obj = new Aggregation("Gaurav");
		AggregationImpl obj2 = new AggregationImpl(obj);
		System.out.println("name is main class : "+obj2.name);
		System.out.println("name in other class : "+obj.name);
		
	}
}

class Aggregation{
	String name;
	Aggregation(String name){
		this.name=name;
	}
	void getName() {
		System.out.println("name : "+name);
	}
}
