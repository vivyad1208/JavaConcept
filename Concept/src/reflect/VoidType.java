package reflect;

import java.lang.reflect.Method;

import str.StringWays;

public class VoidType {

	public static void main(String[] args) {

		Method[] methods = StringWays.class.getDeclaredMethods();
		for (Method method : methods) {
			if(method.getReturnType()==Void.TYPE)
				System.out.println(method);
		}
	}

	public void get() {}
	public void set() {}
}
