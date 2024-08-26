package practice.Exception;

public class CustomExceptionImpl {
public static void main(String[] args) {
	try {
		if(true) {
			throw new CustomException("inside custom exception");
		}
	}catch(CustomException e) {
		System.out.println("custom exception message : "+e.getMessage());
	}
}
}
