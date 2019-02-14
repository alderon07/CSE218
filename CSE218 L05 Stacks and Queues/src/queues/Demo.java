package queues;

public class Demo {

	public static void main(String[] args) {
		QueueX theQ = new QueueX(5);
		theQ.insert(10);
		theQ.insert(20);
		theQ.insert(30);
		theQ.insert(40);
		theQ.insert(50);
		System.out.println(theQ.isFull());
		
		System.out.println(theQ.remove());
		
		
	}

}
