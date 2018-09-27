package doublyLinkedLinkedLists;

public class Demo {

	public static void main(String[] args) {
		DoublyLinkedList theList = new DoublyLinkedList();
		theList.insertFirst(11);
		theList.insertFirst(22);
		theList.insertFirst(33);
		theList.insertLast(44);
		
		theList.displayForward();
		
		theList.deleteLast();
		
		theList.displayForward();
	}

}
