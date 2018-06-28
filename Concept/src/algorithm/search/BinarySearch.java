package algorithm.search;

import algorithm.Helper;

/**
 * Binary search runs in at worst logarithmic time, making O(log n) comparisons, <br/>
 * where n is the number of elements in the array, the O is Big O notation, <br/>
 * and log is the logarithm. Binary search takes constant (O(1)) space, <br/>
 * meaning that the space taken by the algorithm is the same for <br/>
 * any number of elements in the array.[6] Although specialized data structures <br/>
 * designed for fast searching—such as hash tables—can be searched more efficiently, <br/>
 * binary search applies to a wider range of problems.
 * 
 * @author Vivek
 *
 */
public class BinarySearch extends Search {

	public BinarySearch(int[] arr, int searchFor) {
		super(arr, searchFor);
	}


	public int search(int[]A, int element) {
		if(Helper.isNullOrEmpty(A))
			return -1;
		return binarySearch(A, element, 0, A.length-1);
	}


	public static int binarySearch(int[]A, int element, int low, int high) {
		// High greater or equal to Low
		if(high>=low) {

			// Find Middle and Search in Middle
			int mid = (high+low)/2;
			if(element==A[mid])
				return mid;

			// Check Equality of High=Low
			if(high==low)
				return -1;

			// Check One Backward
			if(element<A[mid]) {
				if(mid>0 && element>A[mid-1])
					return -1;
				else
					return binarySearch(A, element, low, mid);
			}
			// Check One Forward
			else {
				if(element<A[mid+1])
					return -1;
				else
					return binarySearch(A, element, mid+1, high);
			}
		}
		return -1;
	}

}
