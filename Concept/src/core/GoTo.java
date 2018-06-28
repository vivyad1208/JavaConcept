package core;

public class GoTo {

	public static void main(String[] args) {
		hiya:
		for (int i = 0; i < 5; i++) {
			System.out.print("("+i+") ");
			for (int j = 0; j < 5; j++) {
				if(i>0 && i%2==0 && j%2==0)
					break hiya;
				System.out.print(j+", ");
			}
			System.out.println();
		}
	}
}
