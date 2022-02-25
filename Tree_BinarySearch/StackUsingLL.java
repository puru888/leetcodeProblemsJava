package Tree_BinarySearch;

public class StackUsingLL<T> {
	
	Node<T> head;
	int size;

	public int size() {return size;};
	public boolean isEmpty() {return size == 0;};
	public T front() {return head.data;};
	
	public Node<T> push(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
		size++;
		return head;
	}
	
	public void pop() {
		if(size == 0)
			System.out.println("StackEmptyException");
		head = head.next;
		size--;
	}
	



}