package algorithm.search;

import java.lang.reflect.Constructor;

import algorithm.Helper;

public abstract class Search {

	private int pos=0;

	public static void main(String[] args) throws Exception {

		int[]arr =  {-9, 14, 37, 102, 128};
		int searchFor = 102;

		Class<?> cls = InterpolationSearch.class;
		String clsName = getClassName(cls);

		@SuppressWarnings("unchecked")
		Constructor<Search> sortConstrutor = (Constructor<Search>) cls.getConstructor(Class.forName("[I"), int.class);

		Search search = sortConstrutor.newInstance(arr, searchFor);

		a.Api.print(arr, "Using "+clsName+" to search from: ");
		System.out.println("Element "+searchFor+" found at position: "+search.getPos());
	}


	private static String getClassName(Class<?> cls) {
		String clsName =  cls.toString();
		return clsName.substring(clsName.lastIndexOf(".")+1);
	}


	public Search(int[]arr, int searchFor) {
		if(Helper.isNullOrEmpty(arr))
			throw new NullPointerException("The input array cannot be NULL or empty!");
		pos = search(arr, searchFor);
	}


	abstract protected int search(int[]arr, int searchFor);


	public int getPos() {
		return pos;
	}
}
