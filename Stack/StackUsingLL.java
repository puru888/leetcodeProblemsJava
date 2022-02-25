package Stack;

public class StackUsingLL<T> {

	private Node<T> head;
	private int size;

	public StackUsingLL() {
	}

	public int size() {
		return size;
	}

	public T top() throws StackEmptyException {
		if (size == 0)
			throw new StackEmptyException();

		return head.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public Node<T> push(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.next = head;
		head = newNode;
		size++;
		return head;
	}

	public void pop() throws StackEmptyException {
		if(size == 0)
			throw new StackEmptyException();
			
		head = head.next;
		size--;
	}

}

class Node<T> {
	Node<T> next;
	T data;

	Node(T data) {
		this.data = data;
		next = null;
	}
}