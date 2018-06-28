package mutable;

public class IntegerMutability {

	public static void main(String[]args) {
		Integer j = 128;
		Integer i = 128;
		if(i==j)
			System.out.println(Integer.toHexString(i));
	}
}
