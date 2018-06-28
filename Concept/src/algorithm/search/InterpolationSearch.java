package algorithm.search;

import algorithm.Helper;

/**
 * On average the interpolation search makes about log(log(n)) <br/>
 * comparisons (if the elements are uniformly distributed), <br/>
 * where n is the number of elements to be searched. <br/>
 * In the worst case (for instance where the numerical values <br/>
 * of the keys increase exponentially) it can make up to O(n) comparisons.
 * 
 * @author Vivek
 *
 */
public class InterpolationSearch extends Search {

	public InterpolationSearch(int[] arr, int searchFor) {
		super(arr, searchFor);
	}

	public int search(int[]A, int element) {
		if(Helper.isNullOrEmpty(A))
			return -1;
		return search(A, element, 0, A.length-1);
	}


	static private int search(int[]Arr, int elem, int L, int H) {
		if(H>=L && Arr[H]>elem && elem>Arr[L]) {
			int frac =  (elem-Arr[L]) * (H-L) / (Arr[H]-Arr[L]) ;
			int mid = L + frac;
			if(elem==Arr[mid])
				return mid;

			// Search on the right side
			if(elem>Arr[mid])
				return search(Arr, elem, mid+1, H);
			// Search on the left side
			else
				return search(Arr, elem, L, mid-1);
		}

		if (elem == Arr[L])
	        return L ;

		return -1;
	}
}
