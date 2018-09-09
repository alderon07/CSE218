package p1IntBag;

public class Demo {

	public static void main(String[] args) {
		Bag theBag = new Bag(10);
		theBag.add(5);
		theBag.add(10);
		theBag.add(2);
		theBag.add(0);
		theBag.display();
		System.out.println(theBag.getMin());
	}

}
