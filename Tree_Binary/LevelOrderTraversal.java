package Tree_Binary;

import java.util.Scanner;

public class LevelOrderTraversal {

	public static BinaryTreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
		int data = sc.nextInt();
		if (data == -1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter left child of " + front.data);
			int leftChild = sc.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
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

	public static void levelOrder(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<>();
		queue.enqueue(root);
		queue.enqueue(null);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> front = queue.dequeue();
			if (front != null) {
				System.out.print(front.data + " ");
				if (front.left != null)
					queue.enqueue(front.left);
				if (front.right != null)
					queue.enqueue(front.right);
			} else if (front == null) {
				System.out.println();
				if(!queue.isEmpty())
					queue.enqueue(null);
			}			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		levelOrder(root);
	}

}
