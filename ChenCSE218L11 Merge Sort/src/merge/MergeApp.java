package merge;

public class MergeApp {
	public static void main(String[] args) {
		int[] arrayA = { 23, 46, 81, 95};
		int[] arrayB = {7, 14, 39, 55, 62, 74};
		int[] arrayC = new int[arrayA.length + arrayB.length];
		
		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC, arrayC.length);
	}
	
	private static void display(int[] theArray, int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}

	private static void merge(int[] a, int sizeA, int[] b, int sizeB, int[] c) {
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		while(aIndex < sizeA && bIndex < sizeB) { // neither array empty
			if(a[aIndex] < b[bIndex]) {
				c[cIndex++] = a[aIndex++];
			} else {
				c[cIndex++] = b[bIndex++];
			}
		}
		
		while(aIndex < sizeA) { // arrayB is empty
			c[cIndex++] = a[aIndex++];
		}
		
		while(bIndex < sizeB) { // arrayA is empty
			c[cIndex++] = b[bIndex++];
		}
		
	}
}
