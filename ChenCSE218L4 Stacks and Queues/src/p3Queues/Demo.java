package p3Queues;

public class Demo {

	public static void main(String[] args) {
		QueueX myQueue = new QueueX(5);
		myQueue.insert(11);
		myQueue.insert(22);
		myQueue.insert(33);
		myQueue.insert(44);
		System.out.println(myQueue.remove());
		System.out.println(myQueue.size());
				
	}

}
