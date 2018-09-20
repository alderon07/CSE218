package p2SampleCode;

public class GenericSearchArray {

	public static void main(String[] args) {
		String[] names = {"Jack", "Kelly", "Beth", "Joe", "Kenny", "Zack"};
		Integer[] numbers = {1, 2, 3, 4, 5,  6};
		int position = sequentialSearch(names, "Joe");
		System.out.println("Joe is found at " + position);
		
		position = sequentialSearch(numbers, 3);
		System.out.println("3 is found at " + position);
	}
	
	private static <E extends Comparable<E>>int sequentialSearch(E[] array, E key) {
		int index = 0;
		int position = -1;
		boolean found = false;
		
		while(!found && index < array.length) {
			if(array[index].compareTo(key) == 0) {
				found = true;
				position = index;
			}
			index++;
		}
		return position;
	}

}
