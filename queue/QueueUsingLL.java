package queue;

public class QueueUsingLL<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;

	QueueUsingLL() {
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(T data) {
		Node<T> newNode = new Node<>(data);
		if (front == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	public T dequeue() throws QueueEmptyException {
		if(size == 0)
			throw new QueueEmptyException();
		
		T temp = front.data;
		front = front.next;
		if(size < 1)
			rear = null;
		size--;
		return temp;
	}
	
	public T front() throws QueueEmptyException {
		if(size == 0)
			throw new QueueEmptyException();
		return front.data;
	}

}

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
		next = null;
	}
}