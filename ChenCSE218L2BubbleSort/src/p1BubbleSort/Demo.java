package p1BubbleSort;

public class Demo {

	public static void main(String[] args) {
		int maxSize = 100;
		ArrayBub arr = new ArrayBub(maxSize);
		arr.insert(88);
		arr.insert(77);
		arr.insert(66);
		arr.insert(55);
		arr.insert(44);
		arr.insert(33);
		arr.insert(22);
		arr.insert(11);
		arr.insert(8);
		arr.insert(7);
		arr.insert(6);
		arr.insert(5);
		arr.insert(4);
		arr.insert(3);
		arr.insert(2);
		arr.insert(1);
//		arr.insert(00);
//		arr.insert(44);
		arr.display();
		long t = System.nanoTime();
		arr.bubbleSort();
		System.out.println(System.nanoTime() - t);
		arr.display();
	}

}
