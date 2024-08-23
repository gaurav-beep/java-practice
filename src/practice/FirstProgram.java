package practice;

import java.io.IOException;
import java.lang.reflect.Method;

public class FirstProgram{
static public void main(String[] args) throws Exception {
	Class c = Class.forName("practice.Outer");
	Method m = c.getDeclaredMethod("getName",String.class);
	Method m2 = c.getDeclaredMethod("privateMethod", null);
	m.setAccessible(true);
	m2.setAccessible(true);
	Object obj = c.getDeclaredConstructor().newInstance();
	m.invoke(null, "gaurav");
	m2.invoke(obj,null);
}
}

class Outer{
	private static void getName(String name) {
		System.out.println("name : " +name);
	}
	private void privateMethod() {
		System.out.println("private method");
	}
}

