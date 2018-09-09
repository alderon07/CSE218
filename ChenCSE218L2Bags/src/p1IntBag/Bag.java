package p1IntBag;

public class Bag {
	private int[] intArray;
	private int nElems;
	
	public Bag(int maxSize) {
		intArray = new int[maxSize];
		nElems = 0;
	}
	
	public void add(int value) {
		intArray[nElems++] = value;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}
	
	public int getMax() {
		int max = intArray[0];
		for(int i = 1; i < nElems; i++) {
			if(max < intArray[i]) {
				max = intArray[i];
			}
		}
		return max;
	}
	
	public int getMin() {
		int min = intArray[0];
		for(int i = 1; i < nElems; i++) {
			if(min > intArray[i]) {
				min = intArray[i];
			}
		}
		return min;
	}
	
	public double getAverage() {
		int total = 0;
		for(int i = 0; i < nElems; i++) {
			total += intArray[i];
		}
		return total * 1.0 / nElems;
	}
}
