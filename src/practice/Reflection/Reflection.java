package practice.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	public static void main(String[] args) throws Exception {
		Class classObj = Class.forName("practice.Reflection.Person");
		/*----------------------------Fields----------------------------------------*/
		Field name = classObj.getDeclaredField("name");
		Field age = classObj.getDeclaredField("age");
		Field city = classObj.getDeclaredField("city");
		Object person = classObj.getConstructor(String.class,String.class).newInstance("Gaurav","22");
		age.setAccessible(true);
		city.set(null, "Mumbai");
		System.out.println("intail  :  {name="+name.get(person)+",age="+age.get(person)+",city="+city.get(null)+"}");
		name.set(person,"Omkar");
		age.set(person, "26");
		System.out.println("after changing  :  {name="+name.get(person)+",age="+age.get(person)+"}");
		/*----------------------------Methods----------------------------------------*/
		Method defaultMethod = classObj.getDeclaredMethod("defaultMethod");
		Method staticMethod = classObj.getDeclaredMethod("staticMethod");
		Method privateMethod = classObj.getDeclaredMethod("privateMethod");
		privateMethod.setAccessible(true);
		defaultMethod.invoke(person);
		staticMethod.invoke(null);
		privateMethod.invoke(person);
	}
}
