/**
 * 
 * @author geromeesperacion
 *
 */

/*
 * implementation of a stack using an array
 */
public class ArrayStack implements Stack {
	
	private int top;
	private Object[] arr;
	
	//constructor
	public ArrayStack() {
		this.top = 0;
		this.arr = new Object[10];
	}
	
	//grows the stack by making it twice as large - called on if needed
	public void grow() {
		Object[] newArr = new Object[arr.length*2];
		System.arraycopy(this.arr, 0, newArr, 0, arr.length);
		this.arr = newArr;
	}
	
	//returns true if there is nothing on the stack
	public boolean empty() {
		
		if(top == 0) {
			return true;
		}
		
		return false;
	}
	
	//places the item on top of the stack
	public void push(Object item) {
		
		if(top == arr.length) {
			grow();
		}
		
		arr[top++] = item;

	}

	//returns and removes the top item of the stack
	public Object pop() {
		
		if(!empty()) {
			return arr[--top];
		}
		
		return null;
	}

	//returns the top item of the stack
	public Object peek() {
		
		if(!empty()) {
			return arr[top - 1];
		}
		
		return null;
	}
	
}
