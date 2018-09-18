package p1StacksUsingArray;

public class Demo {

	public static void main(String[] args) {
		StackX myStack = new StackX(10);
		myStack.push(5);
		myStack.push(1);
		myStack.push(10);
		myStack.push(3);
		myStack.push(7);
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	
		System.out.println(myStack.isFull());
		System.out.println(myStack.isEmpty());
	}

}
