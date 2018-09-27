package doublyLinkedLinkedLists;

public class DoublyLinkedList {
	private Link first;
	private Link last;

	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public void displayForward() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		Link current = last;
		while(current != null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.println();
	}
	
	public Link deleteKey(long dData) {
		Link current = first;
		while(current.dData != dData) {
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		if(current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}
		
		if(current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;
	}
	
	public boolean insertBefore(long key, long dData) {
		Link current = first;
		while (current.dData != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		
		Link newLink = new Link(dData);
		
		if(current == first) {
			newLink.next = first;
			first.previous = newLink;
			first = newLink;
		} else {
			newLink.next = current;
			current.previous.next = newLink;
			newLink.previous = current.previous;
			current.previous = newLink;
		}
		
		return true;
	}
	
	public boolean insertAfter(long key, long dData) {
		Link current = first;
		
		while (current.dData != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		
		Link newLink = new Link(dData);
		
		if(current == last) {
			newLink.next = null;
			last = newLink;
		} else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
	}

	public Link deleteLast() {
		Link temp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	public Link deleteFirst() {
		Link temp = first;

		if (first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertLast(long dData) {
		Link newLink = new Link(dData);

		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
			newLink.previous = last;
		}

		last = newLink;
	}

	public void insertFirst(long dData) {
		Link newLink = new Link(dData);

		if (isEmpty()) {
			last = newLink;
		} else {
			first.previous = newLink;
		}

		newLink.next = first;
		first = newLink;
	}

}
