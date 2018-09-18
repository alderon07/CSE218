package p2InsertionSort;

public class ArrayInsertion {
	private int[] a;
	private int nElems;

	public ArrayInsertion(int max) {
		a = new int[max];
		nElems = 0;
	}

	public void insertionSort() {
		int in;
		int out;

		for (out = 1; out < nElems; out++) {
			int temp = a[out];
			in = out;
			while (in > 0 && a[in - 1] >= temp) {
				a[in] = a[in - 1];
				in--;
			}
			a[in] = temp;

		}
	}

	public void insert(int value) {
		a[nElems++] = value;
	}

	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}
}
