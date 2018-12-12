package p2;

public class Demo {

	public static void main(String[] args) {
		MyFunctionalInterface add = (a, b) -> a + b;
		MyFunctionalInterface subtract = (a, b) -> a - b;
		
		System.out.println(add.compute(1, 2));
		System.out.println(subtract.compute(2, 1));
	}
	
	

}
