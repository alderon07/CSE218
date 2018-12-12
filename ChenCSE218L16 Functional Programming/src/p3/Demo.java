package p3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
//		MyFunctionalInterface add = (a, b) -> a + b;
//		MyFunctionalInterface subtract = (a, b) -> a - b;
//		
//		System.out.println(add.compute(1, 2));
//		System.out.println(subtract.compute(2, 1));
		System.out.println(compute((s1,s2) -> s1 * s2, 5, 6 ));
//		System.out.println(compute(s -> s * s, 5 ));
		
	}
	
	public static int compute(BiFunction<Integer, Integer, Integer> function, Integer value1, Integer value2) {
		return function.apply(value1, value2);
		
	}
	

}
