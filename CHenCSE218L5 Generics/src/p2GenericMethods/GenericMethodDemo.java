package p2GenericMethods;

public class GenericMethodDemo {

	public static void main(String[] args) {
		String[] names = {"Adam", "Bill", "Cathy"};
		displayArray(names);
		Integer[] numbers = {1, 2, 3, 4, 5};
		displayArray(numbers);
	}
	
	// generic method
	public static <E> void displayArray(E[] a) {
		for(E e : a) {
			System.out.println(e);
		}
		System.out.println();
	}
	
//	public static void displayArray(String[] n) {
//		for (String s : n) {
//			System.out.println(s);
//		}
//		System.out.println();
//	}
//	
//	public static void displayArray(Integer[] n) {
//		for (Integer s : n) {
//			System.out.println(s);
//		}
//		System.out.println();
//	}

}
