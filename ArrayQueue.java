/**
 * 
 * @author geromeesperacion
 *
 */

/*
 * implementation of a queue using an array
 */
public class ArrayQueue implements Queue {
	
	private int head;
	private int tail;
	private Object[] arr;
	
	//constructor
	public ArrayQueue() {
		this.head = 0;
		this.tail = 0;
		this.arr = new Object[10];
	}
	
	//grows the queue by making it twice as large - called on if needed
	public void grow() {
		Object[] newArr = new Object[arr.length*2];
		System.arraycopy(this.arr, 0, newArr, 0, arr.length);
		this.arr = newArr;
	}
	
	//returns true if the queue is empty
	public boolean empty() {
		
		if(head == tail) {
			return true;
		}
		
		return false;
	}
	
	//checks if queue is full
	public boolean full() {
		
		if((tail == arr.length-1) || (head == tail + 1)) {
			return true;
		}
		
		return false;
	}
	
	//adds item to the end of the queue
	public void enqueue(Object item) {
		
		if(full()) {
			grow();
		}
		
		arr[tail] = item;
		tail++;
		if(tail >= arr.length) {
			tail = 0;
		}
	}
	
	//returns the first item of the queue and removes it
	public Object dequeue() {
		
		if(empty()) {
			return null;
		}
		
		Object item = arr[head];
		head++;
		
		if(head >= arr.length) {
			head = 0;
		}
		
		return item;
	}
	
}
