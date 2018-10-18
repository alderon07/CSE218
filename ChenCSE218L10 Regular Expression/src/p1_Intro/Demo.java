package p1_Intro;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		String names = "Alan Bill Cate Dave Frank";
		String[] tokens = names.split(" ");
		System.out.println(Arrays.toString(tokens));
		System.out.println(tokens[3]);
	}

}
