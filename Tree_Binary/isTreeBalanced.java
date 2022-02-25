package Tree_Binary;

import java.util.Scanner;

public class isTreeBalanced {

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

	private static int leftNodeCount(BinaryTreeNode<Integer> root) {

		if (root == null)
			return 0;

		int ans = 1;
		ans += leftNodeCount(root.left);
		return ans;
	}

	private static int rightNodeCount(BinaryTreeNode<Integer> root) {

		if (root == null)
			return 0;

		int ans = 1;
		ans += leftNodeCount(root.right);
		return ans;
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if (root == null)
			return false;
		
		return leftNodeCount(root.left) == rightNodeCount(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		System.out.println(isBalanced(root));
	}

}
