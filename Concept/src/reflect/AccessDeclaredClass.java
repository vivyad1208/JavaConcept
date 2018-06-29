package reflect;

import java.lang.reflect.Field;

public class AccessDeclaredClass {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		DeclaredClass obj = new DeclaredClass();
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			System.out.println(field.get(obj));
		}
	}

}
