package keywords;

public class Assert {

	public static void main(String[] args) {
		java.util.LinkedList<String> list = null;
		try {
			assert list!=null : "List cannot be null";
			System.out.println("OK");
		}catch(Throwable ex) {
			System.out.println("Null not allowed");
			System.out.println(ex);
			System.out.println(ex.getMessage());
			ex.printStackTrace(System.out);
		}
	}
}
