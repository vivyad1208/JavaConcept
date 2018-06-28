package algorithm;

public class Helper {

	static public boolean isNullOrEmpty(Object[]A) {
		return A==null || A.length==0;
	}

	static public boolean isNullOrEmpty(int[]A) {
		return A==null || A.length==0;
	}

	static public Integer[] toInteger(int[]A) {
		Integer[] newA = null;
		if(!isNullOrEmpty(A)) {
			newA = new Integer[A.length];
			for(int i=0; i<newA.length; i++) {
				newA[i] = A[i];
			}
		}
		return newA;
	}

	static public int[] toInt(Integer[]A) {
		int[] newA = null;
		if(!isNullOrEmpty(A)) {
			newA = new int[A.length];
			for(int i=0; i<newA.length; i++) {
				newA[i] = A[i];
			}
		}
		return newA;
	}

	static public int[] toInt(int[]A) {
		int[] newA = null;
		if(!isNullOrEmpty(A)) {
			newA = new int[A.length];
			for(int i=0; i<newA.length; i++) {
				newA[i] = A[i];
			}
		}
		return newA;
	}
}
