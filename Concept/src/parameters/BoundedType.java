package parameters;

class BoundedType {

	public static void main(String[] args) {
		Number n = 12.25;
		System.out.println(n);
		
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(new Integer(10));
		// integerBox.inspect("some text"); // error: this is still String!
		System.out.println(integerBox.get());

		// Type Inference and Generic Methods		
		java.util.ArrayList<Box<Integer>> listOfIntegerBoxes = new java.util.ArrayList<>();
		BoundedType.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
		System.out.println(listOfIntegerBoxes);
	}

	public static <T> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		/*
		 * for (T e : anArray) { if (e > elem) { // compiler error // operator (>)
		 * applies only to primitive types ++count; } }
		 */
		return count;
	}

	public static <U> void addBox(U u, java.util.List<Box<U>> boxes) {
		Box<U> box = new Box<>();
		box.set(u);
		boxes.add(box);
	}

	public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
		int counter = 0;
		for (Box<U> box : boxes) {
			U boxContents = box.get();
			System.out.println("Box #" + counter + " contains [" + boxContents.toString() + "]");
			counter++;
		}
	}
}

class Box<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}

	public String toString() {
		return t.toString();
	}
}