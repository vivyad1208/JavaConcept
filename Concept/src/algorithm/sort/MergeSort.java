package algorithm.sort;


/**
 * In sorting n objects, merge sort has an average and worst-case performance of O(n log n).
 * 
 * @author Vivek
 *
 */
public class MergeSort extends Sort {

	public MergeSort(int[] arr) {
		super(arr);
	}

	@Override
	protected void sort(int[] arr, int low, int high) {
		if(low<high) {
			int mid = (low + high) / 2;
			sort(arr, low, mid);
			sort(arr, mid+1, high);
			mergeSort(arr, low, mid, high);
		}
	}

	private void mergeSort(int[]arr, int low, int mid, int high) {
		//Left-Right
		int lenLeft = mid + 1 - low;
		int lenRight = high - mid;

		//Create and Fill Left-Right Arrays
		int[]arrLeft = new int[lenLeft];
		for(int i=0; i<lenLeft; i++)
			arrLeft[i] = arr[low+i];
		int[]arrRight = new int[lenRight];
		for(int i=0; i<lenRight; i++)
			arrRight[i] = arr[mid+1+i];

		int l=0, r=0, i=low;

		while(l<lenLeft && r<lenRight) {
			if(arrLeft[l]<arrRight[r])
				arr[i] = arrLeft[l++];
			else
				arr[i] = arrRight[r++];
			i++;
		}

		while(l<lenLeft) {
			arr[i++] = arrLeft[l++];
		}

		while(r<lenRight) {
			arr[i++] = arrRight[r++];
		}
	}

}
