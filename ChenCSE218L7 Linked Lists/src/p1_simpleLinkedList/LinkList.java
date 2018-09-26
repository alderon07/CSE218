package p1_simpleLinkedList;

public class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(double dData) {
		Link newLink = new Link(dData);
		newLink.setNext(first);
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.getNext();
		return temp;
	}
	
	public Link find(double key) {
		Link current = first;
		while(current.getdData() != key) {
			if(current.getNext() == null) {
				return null;
			} else {
				current = current.getNext();
			}
		}
		return current;
	}
	
	public void displayList() {
		System.out.println("List {First --> Last}");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.getNext();
		}
		System.out.println();
	}
	
	public Link delete(double key) {
		Link current = first;
		Link previous = first;
		
		while(current.getdData() != key) {
			if(current.getNext() == null) {
				return null;
			}else {
				previous = current;
				current = current.getNext();
			}
		}
		
		if(current == first) {
			first = current.getNext();
		} else {
			previous.setNext(current.getNext());
		}
		return current;
	}
}
