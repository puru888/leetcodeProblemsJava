package Tree_BinarySearch;

import java.util.Scanner;

public class BSTtoLL {

	public static BinaryTreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data:");
		int data = sc.nextInt();
		if (data == -1) {
			sc.close();
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter left child of " + front.data);
			int left = sc.nextInt();
			if (left != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(left);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			System.out.println("Enter right child of " + front.data);
			int right = sc.nextInt();
			if (right != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(right);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		sc.close();
		return root;
	}

	public static Pairr<Integer> BSTtoLL(BinaryTreeNode<Integer> root) {
		if (root == null)
			return new Pairr<Integer>();

		Node<Integer> newNode = new Node<>(root.data);
		Pairr<Integer> left = BSTtoLL(root.left);
		Pairr<Integer> right = BSTtoLL(root.right);
		Pairr<Integer> pair = new Pairr<>();

		if (left.tail != null)
			left.tail.next = newNode;

		newNode.next = right.head;

		if (left.head != null)
			pair.head = left.head;
		else
			pair.head = newNode;

		if (right.tail != null)
			pair.tail = right.tail;
		else
			pair.tail = newNode;

		return pair;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		Pairr<Integer> head = BSTtoLL(root);
		while (head.head != null) {
			System.out.print(head.head.data + " ");
			head.head = head.head.next;
		}
	}

}

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}
}

class Pairr<T> {
	Node<T> head;
	Node<T> tail;
}
