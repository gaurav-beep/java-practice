package practice.designpattern;

public class FactoryPattern {
	public static void main(String[] args) {
		String vehicle = "Car";
		Vehicle obj;
		switch(vehicle) {
		case "Bike":
			obj=new Bike();
			break;
		case "Car":
			obj=new Car();
			break;
		case "Bus":
			obj=new Bus();
			break;
		default :
			obj=null;
			break;
		}
		obj.vehicleSelected();
	}
}
interface Vehicle{
	void vehicleSelected();
}
class Car implements Vehicle{
	String vehicle;
	Car(){
		vehicle="Car";
	}
	public void vehicleSelected() {
		System.out.println("vehicle selected : "+this.vehicle);
	}
}
class Bike implements Vehicle{
	String vehicle;
	Bike(){
		vehicle="Bike";
	}
	public void vehicleSelected() {
		System.out.println("vehicle selected : "+this.vehicle);
	}
}
class Bus implements Vehicle{
	String vehicle;
	Bus(){
		vehicle="Bus";
	}
	public void vehicleSelected() {
		System.out.println("vehicle selected : "+this.vehicle);
	}
}
