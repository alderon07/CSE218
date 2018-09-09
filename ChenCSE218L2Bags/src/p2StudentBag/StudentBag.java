package p2StudentBag;

public class StudentBag {
	private Student[] students;
	private int nElems;

	public StudentBag(int maxSize) {
		students = new Student[maxSize];
		nElems = 0;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(students[i]);
		}
	}

	public void insert(Student s) {
		students[nElems++] = s;
	}

	public void displayById(String id) {
		for (int i = 0; i < nElems; i++) {
			if (students[i].getId().equals(id)) {
				System.out.println(students[i]);
				return;
			}
		}
		System.out.println("The id " + id + " is not found");

	}

}
