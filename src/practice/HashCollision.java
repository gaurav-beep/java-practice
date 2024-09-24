package practice;

public class HashCollision {
	public static void main(String[] args) {
		Student student = new Student("Gaurav",22);
		Employee employee = new Employee("Omkar",23);
		System.out.println("student hashcode : "+student.hashCode());
		System.out.println("employee hashcode : "+employee.hashCode());
	}
}

class Student{
	private String name;
	private int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	Student(){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return this.name.length()+this.age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
	
	class Employee{
		private String name;
		private int id;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Employee(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}
		public Employee() {
			super();
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.name.length()+this.id;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + "]";
		}
}
