package p1;

public class EndlessRecursion {
	private static int i = 0;

	public static void main(String[] args) {
		message(i);
	}

	private static void message(int n) {
		if (n < 5) {
			System.out.println("Hi ");
			n++;
			message(n);
		} 
	}

}
