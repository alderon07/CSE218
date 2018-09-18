package p2StacksUsingArrayList;

public class Demo {

	public static void main(String[] args) {
		StackX myStack = new StackX();
		myStack.push(5);
		myStack.push(1);
		myStack.push(10);
		myStack.push(3);
		myStack.push(7);
		System.out.println(myStack.toString());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
		System.out.println(myStack.toString());
	
		System.out.println(myStack.getSize());
		System.out.println(myStack.isEmpty());
		
	}

}
