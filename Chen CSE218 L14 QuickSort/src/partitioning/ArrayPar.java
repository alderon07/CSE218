package partitioning;

public class ArrayPar {
	private long[] theArray;
	private int nElems;

	public ArrayPar(int maxSize) {
		theArray = new long[maxSize];
		nElems = 0;
	}

	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;

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
