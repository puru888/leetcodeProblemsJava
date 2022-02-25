package Tree_Binary;

import java.awt.print.Printable;
import java.util.Scanner;

public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeInput(Scanner sc) {
		System.out.println("Enter root:");
		int data = sc.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);

		if (root.data == -1)
			return null;

		root.left = takeInput(sc);
		root.right = takeInput(sc);

		return root;
	}

	public static void print(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		String s = root.data + ":";
		if (root.left != null)
			s += root.left.data + ",";
		if (root.right != null)
			s += root.right.data + ",";

		System.out.println(s);
		print(root.left);
		print(root.right);
	}

	public static BinaryTreeNode<Integer> takeInputIter() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root:");

		int data = sc.nextInt();
		if (data == -1)
			return null;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {

			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter left child of " + front.data);
			int leftChild = sc.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			System.out.println("Enter right child of " + front.data);
			int rightChild = sc.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}

		return root;
	}

	public static void printIter(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			String s = front.data + ": ";
			if (front.left != null) {
				pendingNodes.enqueue(front.left);
				s += front.left.data + ",";
			} else {
				s += -1 + ",";
			}
			if (front.right != null) {
				pendingNodes.enqueue(front.right);
				s += front.right.data;
			} else {
				s += -1;
			}

			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner sc = new Scanner(System.in);

		BinaryTreeNode<Integer> root = takeInputIter();
		printIter(root);

	}

}
