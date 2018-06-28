package parameters;

@SuppressWarnings("unused")
public class ParameterPrecedence {

	public static void main(String[] args) {
		primitive(5);
		double d = 2l;
		//primitive(new Integer(5));
	}

	private static void primitive(int i) {
		System.out.println("int");
	}
	
	/*private static void primitive(Integer i) {
		System.out.println("Integer");
	}*/
	
	/*private static void primitive(long l) {
		System.out.println("long");
	}*/
	
	/*private static void primitive(Long i) {
		System.out.println("Long");
	}*/
	
	/*private static void primitive(double l) {
		System.out.println("double");
	}*/
	
	/*private static void primitive(Double i) {
		System.out.println("Double");
	}*/
	
	/*private static void primitive(float l) {
		System.out.println("float");
	}*/
	
	/*private static void primitive(Float i) {
		System.out.println("Float");
	}*/
}
