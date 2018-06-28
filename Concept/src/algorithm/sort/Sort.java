package algorithm.sort;

import java.lang.reflect.Constructor;
import java.util.Arrays;

import algorithm.Helper;

public abstract class Sort {

	public static void main(String[] args) throws Exception {
		int arr[] = {11, 5, 13, 6, 12};
		int arr2[] = Arrays.copyOf(arr, arr.length);

		Class<?> cls = HeapSort.class;
		String clsName = getClassName(cls);
		Constructor<?> sortConstrutor = cls.getConstructor(Class.forName("[I"));
		sortConstrutor.newInstance(arr2);

		a.Api.print(arr, "Before "+clsName+": ");
		a.Api.print(arr2, "After "+clsName+": ");
	}


	private static String getClassName(Class<?> cls) {
		String clsName =  cls.toString();
		return clsName.substring(clsName.lastIndexOf(".")+1);
	}


	public Sort(int[]arr) {
		if(Helper.isNullOrEmpty(arr))
			throw new NullPointerException("The input array cannot be NULL or empty!");
		sort(arr, 0, arr.length-1);
	}

	abstract protected void sort(int[]arr, int num, int size);
}
