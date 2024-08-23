package practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
	Class obj = Class.forName("practice.Demo");
	Method privateMethod = obj.getDeclaredMethod("privatemethod", null);
	Object demo = obj.getDeclaredConstructor().newInstance();
	privateMethod.setAccessible(true);
	privateMethod.invoke(demo);
	Method staticmethod = obj.getDeclaredMethod("staticmethod", null);
	staticmethod.invoke(null);
}
}
class Demo{
	private void privatemethod() {
		System.out.println("private method");
	}
	static void staticmethod() {
		System.out.println("static method");
	}
}
