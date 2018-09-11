package p1SelectionSort;

public class ArraySelection {
	private int[] a;
	private int nElems;

	public ArraySelection(int max) {
		a = new int[max];
		nElems = 0;
	}

	public void selectionSort() {
		int out;
		int in;
		int min;

		for (out = 0; out < nElems - 1; out++) {
			min = out;
			for (in = out + 1; in < nElems; in++) {
				if (a[in] < a[min]) {
					min = in;
				}
			}
			swap(out, min);
		}
	}

	private void swap(int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
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
