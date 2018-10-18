package mergeSort;

public class Demo {

	public static void main(String[] args) {
		DArray arr = new DArray(100);
		arr.insert(23);
		arr.insert(13);
		arr.insert(32);
		arr.insert(3);
		arr.insert(10);
		arr.insert(21);
		arr.insert(42);
		arr.insert(1);
		arr.display();
		arr.mergeSort();
		arr.display();
	}

}
