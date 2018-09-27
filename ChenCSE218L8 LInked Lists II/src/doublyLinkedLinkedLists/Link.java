package doublyLinkedLinkedLists;

public class Link {
	public long dData;
	public Link next;
	public Link previous;
	
	public Link(long dData) {
		this.dData = dData;
		next = null;
		previous = null;
	}
	
	public void displayLink() {
		System.out.print(dData + " ");
	}
}
