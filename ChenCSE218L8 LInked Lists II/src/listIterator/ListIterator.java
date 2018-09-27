package listIterator;

public class ListIterator {
	private Link current;
	private Link previous;
	private LinkList ourList;
	
	public ListIterator(LinkList list) {
		ourList = list;
		reset();
	}
	
	public long deleteCurrent() {
		long value = current.dData;
		if(previous == null) {
			ourList.setFirst(current.next);
			reset();
		} else {
			previous.next = current.next;
			if(atEnd()) {
				reset();
			} else {
				current = current.next;
			}
		}
		return value;
	}
	
	public void insertBefore(long dd) {
		Link newLink = new Link(dd);
		if(previous == null) { // at the beginning of list
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		} else {
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	
	public void insertAfter(long dd) { //insert after the current link
		Link newLink = new Link(dd);
		if(ourList.isEmpty()) {
			ourList.setFirst(newLink);
			current = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
	
	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}
	
	public boolean atEnd() {
		return current.next == null;
	}
	
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	
	public Link getCurrent() {
		return current;
	}
}
