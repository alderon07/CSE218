package listIterator;

public class Demo {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		ListIterator iter1 = theList.getIterator();
		
		iter1.insertAfter(21);
		iter1.insertAfter(40);
		iter1.insertAfter(30);
		iter1.insertAfter(7);
		iter1.insertAfter(45);
		
		theList.displayList();
		
		iter1.reset();
		iter1.insertAfter(1111);
		theList.displayList();
		
		iter1.nextLink();
		iter1.nextLink();
		iter1.insertAfter(2222);
		theList.displayList();
		
		iter1.getCurrent().displayLink();
	}

}
