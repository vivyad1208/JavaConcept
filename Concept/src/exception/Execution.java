package exception;

public class Execution {


	public static void main(String[] args) {
		try {
			throw new ExceptionDemo();
		} catch (ExceptionDemo ex) {
			ex.printStackTrace();
		}
	}


	static class ExceptionDemo extends Exception {
		public ExceptionDemo() {
			System.out.println("Inside '"+this.toString()+"' Constructor");
		}

		public String method() throws Exception {
			return "";
		}
	}


	static class NewExceptionDemo extends ExceptionDemo {
		@Override
		public String method() throws Exception {
			return "";
		}
	}


}
