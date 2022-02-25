package Tree_BinarySearch;

import java.util.Scanner;

public class PathSumToRootLeaf {

	public static BinaryTreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root:");
		int data = sc.nextInt();
		if (data == -1) {
			sc.close();
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
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

	public static void rootToLeafPath(BinaryTreeNode<Integer> root, String path, int k, int sum) {
		if (root == null)
			return;

		if (root.left == null && root.right == null)
			sum += root.data;

		if (sum == k) {
			System.out.println(path + root.data);
			return;
		}
		rootToLeafPath(root.left, path + root.data+" ", k, sum + root.data);
		rootToLeafPath(root.right, path + root.data+" ", k, sum + root.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		rootToLeafPath(root, "", 13, 0);
	}

}
