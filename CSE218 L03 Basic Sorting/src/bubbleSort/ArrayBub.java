package bubbleSort;

public class ArrayBub {
	private int[] a;
	private int nElems;

	public ArrayBub(int max) {
		a = new int[max];
		nElems = 0;
	}

	public void insert(int n) {
		a[nElems++] = n;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void bubbleSort() {
		int out;
		int in;
		for (out = nElems - 1; out >= 1; out--) {
			for (in = 0; in < out; in++) {
				if (a[in] > a[in + 1]) {
					swap(in, in + 1);
				}
			}
		}
	}
	
	private void swap(int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
