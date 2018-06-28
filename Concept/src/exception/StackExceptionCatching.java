package exception;

import java.io.IOException;

public class StackExceptionCatching {

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
			ex.printStackTrace();
		}
	}

	static void recursiveCall() {
		recursiveCall();
	}
}
