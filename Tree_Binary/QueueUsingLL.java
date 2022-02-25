package Tree_Binary;

public class QueueUsingLL<T> {
	
	Node<T> front;
	Node<T> rear;
	int size;
	
	QueueUsingLL(){};
	
	public int size () {return size;};
	public T front(){return front.data;};
	public boolean isEmpty() {return size == 0;};
	
	public void enqueue(T data) {
		Node<T> newNode = new Node<>(data);
		if(front == null)
		{
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
	
	public T dequeue() {
		if(size == 0)
			System.out.println("QueueEmpty Exception");
		
		T temp = front.data;
		front = front.next;
		size--;
		return temp;
	}
	
	
	
}

class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
	}
}