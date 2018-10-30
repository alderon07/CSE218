package compare_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(-10, 100.0);
		BankAccount ba2 = new BankAccount(5, 100.0);
		BankAccount ba3 = new BankAccount(1, 100.0);
		BankAccount ba4 = new BankAccount(-1, 100.0);
		// example1
//		BankAccount[] arr = {ba1, ba2, ba3, ba4};
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
		
		//example2
		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(ba1);
		list.add(ba2);
		list.add(ba3);
		list.add(ba4);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
