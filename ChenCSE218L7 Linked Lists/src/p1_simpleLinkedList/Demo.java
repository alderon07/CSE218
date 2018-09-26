package p1_simpleLinkedList;

public class Demo {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.insertFirst(1.1);
		theList.insertFirst(2.2);
		theList.insertFirst(3.3);
		theList.insertFirst(4.4);
		theList.displayList();
		
		Link f = theList.find(3.3);
		
		if(f == null) {
			System.out.println("The link is not found!");
		} else {
			System.out.println("The link is found.");
		}
		
		Link d = theList.delete(2.2);
		if(d != null) {
			System.out.println("The link is deleted");
		} else {
			System.out.println("The Link is not deleted!");
		}
		
		theList.displayList();
		
		while(!theList.isEmpty()) {
			Link aLink = theList.deleteFirst();
			System.out.print("Deleted ");
			aLink.displayLink();
			System.out.println();
		}
		theList.displayList();
	}

}
