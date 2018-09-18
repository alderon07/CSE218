package p1StacksUsingArray;

public class StackX {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public StackX(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new long[this.maxSize];
		top = -1;
	}
	
	public void push(long value) {
		stackArray[++top] = value;
	}
	
	public long pop() {
		return stackArray[top--];
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}

}
