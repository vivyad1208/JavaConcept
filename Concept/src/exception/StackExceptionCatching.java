package exception;

public class StackExceptionCatching {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String nul = null;
			nul.toCharArray();
		}
		catch(Exception ex) {
			System.out.println(ex);
			System.out.println(ex.getCause());
			System.out.println(ex.getLocalizedMessage());
			System.out.println(ex.getMessage());
			System.out.println(ex.fillInStackTrace());
			ex.printStackTrace();
		}
	}

	static void recursiveCall() {
		recursiveCall();
	}
}
