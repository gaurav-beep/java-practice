package practice.designpattern;

public class BuilderPattern {
private String firstName,lastName,city;
private int age;
BuilderPattern(Builder builder){
	this.firstName=builder.firstName;
	this.lastName=builder.lastName;
	this.age=builder.age;
	this.city=builder.city;
}
public static class Builder{
	private String firstName,lastName,city;
	private int age;
	Builder(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	Builder setAge(int age) {
		this.age=age;
		return this;
	}
	Builder setCity(String city) {
		this.city=city;
		return this;
	}
	BuilderPattern build() {
		return new BuilderPattern(this);
	}
	@Override
	public String toString() {
		return "Builder [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", age=" + age + "]";
	}
	
}
public static void main(String[] args) {
	BuilderPattern obj = new BuilderPattern.Builder("Gaurav", "Yadav").setAge(22).setCity("Mumbai").build();
	System.out.println(obj.firstName+":"+obj.lastName+":"+obj.age+":"+obj.city);
}
}
