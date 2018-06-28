
package polymorphism;

public class CovariantReturnType {
	public static void main(String[] args) {
		System.out.println(new A().getCls().toString());
		System.out.println(new B().getCls().toString());
	}
}

class A {
	A getCls() {
		return this;
	}
	
}

class B extends A {
	B getCls() {
		return this;
	}
}
