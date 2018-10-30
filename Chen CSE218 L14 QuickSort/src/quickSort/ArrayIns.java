package quickSort;

public class ArrayIns {
	private long[] theArray;
	private int nElems;

	public ArrayIns(int maxSize) {
		theArray = new long[maxSize];
		nElems = 0;
	}
	
	public void quickSort() {
		recQuickSort(0, nElems-1);
	}
	
	public void recQuickSort(int left, int right) {
		if(right - left <= 0) {
			return;
		} else {
			long pivot = theArray[right];
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition-1);
			recQuickSort(partition + 1, right);
		}
	}

	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;

		while (true) {
			while (leftPtr < right && theArray[++leftPtr] < pivot) {
				; // nop
			}

			while (rightPtr > left && theArray[--rightPtr] > pivot) {
				; // nop
			}

			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr, rightPtr);
			}
		} // end outer while loop
		swap(leftPtr, right);
		return leftPtr;
	}

	private void swap(int dex1, int dex2) {
		long temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}

	public int size() {
		return nElems;
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
