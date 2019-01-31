package int_bag;

public class Bag {
	private int[] array;
	private int nElems;
	private int maxSize;
	
	public Bag(int maxSize) {
		array = new int[maxSize];
		nElems = 0;
		this.maxSize = maxSize;
	}
	
	public void add(int number) {
		array[nElems++] = number;
//		nElems++;
	}
	
	public boolean isFull() {
		if (nElems == maxSize) {
			return true;
		} else {
			return false;
		}
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
	}
	
	public boolean find(int number) {
		for(int i = 0; i < nElems; i++) {
			if(array[i] == number) {
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(int number) {
		int count = 0;
		for(count = 0; count < nElems; count++) {
			if(array[count] == number) {
				break;
			}
		}
		
		if (count == nElems) {
			return false;
		} else {
			for(int i = count; i < nElems-1; i++) {
				array[i] = array[i + 1];
			}
			nElems--;
			return true;
		}
				
	}

}
