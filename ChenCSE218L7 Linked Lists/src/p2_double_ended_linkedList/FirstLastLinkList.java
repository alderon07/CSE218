package p2_double_ended_linkedList;

public class FirstLastLinkList {
	public Link first;
	public Link last;
	
	public FirstLastLinkList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayList() {
		System.out.println("List (first --> last):");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	public double deleteFirst() {
		double temp = first.dData;
		if(first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}
	
	public void insertFirst(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			last = newLink;
		} 
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(double dData) {
		Link newLink = new Link(dData);
		if(isEmpty()) {
			first = newLink;
		}else {
			last.next = newLink;
		}
		last = newLink;
	}
	
	
}
