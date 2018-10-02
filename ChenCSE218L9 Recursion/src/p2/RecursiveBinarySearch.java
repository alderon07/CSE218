package p2;

import java.util.Scanner;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] numbers = { 101, 203, 205, 311, 321, 345, 541, 642 };
		int result;
		int searchValue;
		String again;

		Scanner kb = new Scanner(System.in);
		do {
			System.out.println("Enter a value to search for:  ");
			searchValue = kb.nextInt();
			result = binarySearch(numbers, 0, numbers.length - 1, searchValue);

			if (result == -1) {
				System.out.println(searchValue + " was not found");
			} else {
				System.out.println(searchValue + " was found at element " + result);
			}

			kb.nextLine();

			System.out.println("Do you want to search again? ");
			again = kb.nextLine();

		} while (again.charAt(0) == 'Y' || again.charAt(0) == 'y');

	}

	public static int binarySearch(int[] array, int first, int last, int value) {
		int middle;
		if (first > last) { // base case
			return -1;
		}
		middle = (first + last) / 2;
		if (array[middle] == value) {		
			return middle; // base case
		} else if (array[middle] < value) {
			return binarySearch(array, middle + 1, last, value);
		} else {
			return binarySearch(array, first, middle - 1, value);
		}
	}

}
