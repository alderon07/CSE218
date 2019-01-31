package object_bag;

public class Bag {
	private Student[] array;
	private int nElems;
	
	public Bag(int maxSize) {
		array = new Student[maxSize];
		nElems = 0;
	}
	
	public void insert(Student s) {
		array[nElems++] = s;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
	}
	
	public Student findByName(String name) {
		for(int i  = 0; i < nElems; i++) {
			if(array[i].getName().equals(name)) {
				return array[i];
			}
		}
		return null;
	}
	
	public Student removeByName(String name) {
		int count = 0;
		for(count = 0; count < nElems; count++) {
			if(array[count].getName().equals(name)) {
				break;
			}
		}
		if(count == nElems) {
			return null;
		} else {
			Student temp = array[count];
			for(int i = count; i< nElems - 1; i++) {
				array[i] = array[i+1];
			}
			nElems--;
			return temp;
		}
		
	}
	
}
