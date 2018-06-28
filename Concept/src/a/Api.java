package a;

import java.util.Iterator;
import java.util.List;


public class Api {


	public static void print(Object[]objects, String...strs) {
		System.out.println( (strs!=null && strs.length>0) ? strs[0] : "" );
		for(int i=0; objects.length>i; i++)
			System.out.println( i + " -> " + objects[i] );
		if(strs!=null && strs.length>1)
			System.out.print(strs[1] );
		else
			System.out.println();
	}


	public static void print(int[]arr, String...strs) {
		System.out.print( (strs!=null && strs.length>0) ? strs[0] : "" );
		for(int a : arr)
			System.out.print( a + " " );
		System.out.println("["+arr.length+"]");
	}


	public static void print(List<?> list, String...strs) {
		System.out.print( (strs!=null && strs.length>0) ? strs[0] : "" );
		for(Object l : list)
			System.out.print( l + " ");
		System.out.println("["+list.size()+"]");
	}


	public static void print(Iterator<?> itr, String...strs) {
		int size = 0;
		System.out.print( (strs!=null && strs.length>0) ? strs[0] : "" );
		while(itr.hasNext() && ++size>0)
			System.out.print( itr.next() + " " );
		System.out.println("["+size+"]");
	}


	public static int swap(int[] arr, int index1, int index2) {
		int temp = arr[index1] ;
		arr[index1] = arr[index2];
		arr[index2] = temp;
		return index2;
	}


	public static int swap(char[] arr, int index1, int index2) {
		char temp = arr[index1] ;
		arr[index1] = arr[index2];
		arr[index2] = temp;
		return index2;
	}
}
