package p2StudentBag;

public class Demo {

	public static void main(String[] args) {
		StudentBag theBag = new StudentBag(10);
		theBag.insert(new Student("John", "Doe", 4.0, "100011"));
		theBag.insert(new Student("Jane", "Doe", 3.0, "100012"));
		theBag.insert(new Student("David", "Smith", 2.0, "100013"));
		theBag.display();
		System.out.println("--------");
		theBag.displayById("100016");
	}

}
