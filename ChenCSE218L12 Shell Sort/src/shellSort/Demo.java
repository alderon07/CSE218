package shellSort;

public class Demo {

	public static void main(String[] args) {
		int maxSize = 10;
		ArraySh arr = new ArraySh(maxSize);
		arr.insert(2);
		arr.insert(9);
		arr.insert(5);
		arr.insert(4);
		arr.insert(7);
		arr.insert(0);
		arr.insert(3);
		arr.insert(6);
		arr.insert(1);
		arr.insert(8);
		
		arr.display();
		arr.shellSort();
		arr.display();
	}

}
