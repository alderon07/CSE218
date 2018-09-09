package p1BubbleSort;

public class ArrayBub {
	private int[] a;
	private int nElems;
	
	public ArrayBub(int max) {
		a = new int[max];
		nElems = 0;
	}
	
	public void insert(int value) {
		a[nElems++] = value;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public void bubbleSort() {
		int out;
		int in;
		int numberOfComparisons = 0;
		for(out = nElems -1; out >= 1; out--) {
			for(in = 0; in < out; in++) {
				numberOfComparisons++;
				if(a[in] > a[in +1]) {
					
					swap(in, in+1);
				}
			}
//			System.out.println(a[out]);
		}
		System.out.println("Number of Comparisons: " + numberOfComparisons);
	}
	
	private void swap(int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
