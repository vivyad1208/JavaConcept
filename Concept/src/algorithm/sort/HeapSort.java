package algorithm.sort;

public class HeapSort extends Sort {

	public HeapSort(int[] arr) {
		super(arr);
	}

	@Override
	protected void sort(int[] arr, int low, int heapsize) {
		// DEC ITERATE -> HALF HEAP CONDITION
		// Build heap (rearrange array)
		// Start from between towards beginning
		for(int node=heapsize/2; node>=0; node--)
			heapify(arr, node, heapsize);

		// DEC ITERATE -> FULL HEAP CONDITION & SWAP
		// One by one extract each element from the heap
		// Start from the end towards beginning
		for(int size=heapsize; size>=0; size--) {
			// Move current root element to end
			a.Api.swap(arr, 0, size);
			// Call Max Heap on reduced heap
			heapify(arr, 0, size);
		}
	}

	private void heapify(int[] arr, int node, int size) {
		int root = node;
		int left = (2*root) + 1;
		int right = left + 1;

		// If left child is larger than root
		if(size>left && arr[left]>arr[root])
			root = left;
		if(size>right && arr[right]>arr[root])
			root = right;
		if(node!=root) {
			a.Api.swap(arr, root, node);
			// Recursively heapify the affected sub-tree
			heapify(arr, root, size);
		}
		
	}

}
