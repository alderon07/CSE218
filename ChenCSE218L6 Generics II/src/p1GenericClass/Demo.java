package p1GenericClass;

public class Demo {

	public static void main(String[] args) {
		Point<Integer> p1 = new Point<>(10, 1);
		Point<Double> p2 = new Point<> (1.5, 2.0);
		Point<String> p3 = new Point<> ("One", "Two");
		displayPoint(p1);
//		displayPoint(p2);
//		displayPoint(p3);
 	}
	
	private static void displayPoint
			(Point<? super Integer> point) {
		System.out.println(point);
	}

}
