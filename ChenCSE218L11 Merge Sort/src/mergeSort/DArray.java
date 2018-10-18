package mergeSort;

public class DArray {
	private long[] theArray;
	private int nElems;

	public DArray(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	public void merge(long[] workspace, int lowPtr, int highPtr, int upperBound) {
		int j = 0; // workspace index
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1; // # of items

		while (lowPtr <= mid && highPtr <= upperBound) { // neither array empty
			if (theArray[lowPtr] < theArray[highPtr]) {
				workspace[j++] = theArray[lowPtr++];
			} else {
				workspace[j++] = theArray[highPtr++];
			}
		}

		while (lowPtr <= mid) { // high half is empty
			workspace[j++] = theArray[lowPtr++];
		}

		while (highPtr <= upperBound) { // low half is empty
			workspace[j++] = theArray[highPtr++];
		}

		for (j = 0; j < n; j++) {
			theArray[lowerBound + j] = workspace[j];
		}

	}

	public void recMergeSort(long[] workspace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound) { // base case
			return;
		} else {
			int mid = (lowerBound + upperBound) / 2;
			recMergeSort(workspace, lowerBound, mid);
			recMergeSort(workspace, mid + 1, upperBound);
			merge(workspace, lowerBound, mid + 1, upperBound);
		}
	}

	public void mergeSort() {
		long[] workspace = new long[nElems];
		recMergeSort(workspace, 0, nElems - 1);
	}

	public void insert(long value) {
		theArray[nElems++] = value;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}

}
