package practice.Exception;

public class ExceptionImpl {
public static void main(String[] args) {
	try {
		System.out.println(1/0);
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("finally block : always executed");
	}
}
}
