package queue;

public class QueueUsingArr {

	private int data[];
	private int front;
	private int rear;
	private int size;

	QueueUsingArr() {
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;
	}

	QueueUsingArr(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int front() throws QueueEmptyException {
		if (size == 0)
			throw new QueueEmptyException();

		return data[front];
	}

	public void doubleCapacity()
	{
		int temp[] = data;
		data = new int[temp.length*2];
		int index = 0;
		
		for (int i = front; i < temp.length; i++) {
			data[index] = temp[i];
			index++;
		}
		for (int i = 0; i < front; i++) {
			data[index] = temp[i];
			index++;
		}
		front = 0;
		rear = temp.length-1;
	}
	
	public void enqueue(int element) {
		
		if(size == data.length)
			doubleCapacity();
		
		if (size == 0)
			front = 0;
		
		size++;
		
		rear = (rear + 1 ) % data.length;
	
//		rear++;
//		if(rear == data.length)
//			rear = 0;
		
		data[rear] = element;
	}
	
	public int dequeue() throws QueueEmptyException{
		
		if(size == 0)
			throw new QueueEmptyException();
		
		int temp = data[front];
		
		front = (front + 1 )%data.length;
		
//		front++;
//		if(front == data.length)
//			front = 0;
		
		size--;
		if(size == 0)
		{
			front = -1;
			rear = -1;
		}
		
		return temp;
	}

}
