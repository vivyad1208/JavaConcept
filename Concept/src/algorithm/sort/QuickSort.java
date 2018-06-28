package algorithm.sort;

/**
 * Time Complexity -> O(n log n)
 * 
 * @author Vivek
 *
 */
public class QuickSort extends Sort {

	public QuickSort(int[]arr) {
		super(arr);
	}

	@Override
	protected void sort(int[]arr, int low, int high) {
		if(low<high) {
			int partition = partition(arr, low, high);
			sort(arr, low, partition-1);
			sort(arr, partition+1, high);
		}
	}

	private int partition(int[]arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		int j = i-1;
		while(i < high) {
			if(arr[i] <= pivot)
				a.Api.swap(arr, i, ++j);
			i++;
		}
		a.Api.swap(arr, i, ++j);
		return j;
	}
}
