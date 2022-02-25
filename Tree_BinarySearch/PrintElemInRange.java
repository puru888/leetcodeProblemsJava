package Tree_BinarySearch;

import java.util.Scanner;

public class PrintElemInRange {

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
			System.out.println("Enter left chilf of " + front.data);
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

		return root;
	}

	public static void printElemInRange(BinaryTreeNode<Integer> root, int from,int to) {
		if(root == null)
			return;
		
		if(root.data > from && root.data < to) {
			System.out.print(root.data+" ");
			printElemInRange(root.left, from, to);
			printElemInRange(root.right, from, to);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		printElemInRange(root, 10, 50);
	}

}
