package algorithm.sort;

/**
 * Time Complexity -> O(n^2)
 * 
 * @author Vivek
 *
 */
public class InsertionSort extends Sort {

	public InsertionSort(int[]arr) {
		super(arr);
	}

	@Override
	protected void sort(int[] arr, int low, int high) {
		// Iterate - Swapping
		for(int i=0; arr.length>i; i++) {
			// Temporary Value
			int temp = arr[i];
			// An index ahead
			int j = i-1;
			// Swapping smaller no with bigger
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				--j;
			}
			// Final swap
			arr[j+1] = temp;
		}
	}

}
