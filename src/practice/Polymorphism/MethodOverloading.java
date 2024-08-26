package practice.Polymorphism;

public class MethodOverloading {
void area(float radius) {
	System.out.println("Area of circle : "+Math.PI*Math.pow(radius, 2));
}
void area(int length,int breadth) {
	System.out.println("Area of rectangle : "+length*breadth);
}
void area(int side) {
	System.out.println("Area of square : "+Math.pow(side, 2));
}
public static void main(String[] args) {
	MethodOverloading obj = new MethodOverloading();
	obj.area(5.2f);
	obj.area(5);
	obj.area(5, 6);
}
}
