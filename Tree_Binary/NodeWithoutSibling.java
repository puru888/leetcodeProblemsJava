package Tree_Binary;

import java.util.Scanner;

public class NodeWithoutSibling {

	public static BinaryTreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
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
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}

		return root;
	}

	public static void printNodeWithoutSibling(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		if (root.left == null && root.right != null)
			System.out.println(root.right.data);
		else if (root.right == null && root.left != null)
			System.out.println(root.left.data);

		if (root.left != null)
			printNodeWithoutSibling(root.left);
		if (root.right != null)
			printNodeWithoutSibling(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		printNodeWithoutSibling(root);
	}

}
