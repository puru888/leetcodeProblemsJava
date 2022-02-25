package Tree_BinarySearch;

import java.util.Scanner;

public class BST_class {

	public static BinaryTreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
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
			System.out.println("Enter left chlid of " + front.data);
			int left = sc.nextInt();
			if (left != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(left);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			System.out.println("Enter right child of " + front.data);
			int right = sc.nextInt();
			if (right != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(right);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}

		sc.close();
		return root;
	}

	public static boolean search(BinaryTreeNode<Integer> root, int element) {
		if (root == null)
			return false;

		if (root.data == element)
			return true;
		else if (root.data < element)
			return search(root.right, element);
		else
			return search(root.left, element);
	}

	public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int element) {
		if (root == null)
			return new BinaryTreeNode<Integer>(element);

		if (element > root.data)
			root.right = insert(root.right, element);
		else
			root.left = insert(root.left, element);

		return root;
	}

	public static BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root, int element) {
		if (root == null)
			return null;

		if (root.data > element) {
			root.left = delete(root.left, element);
			return root;
		}
		else if (root.data < element) {
			root.right = delete(root.right, element);
			return root;
		}
		else {
			if(root.left == null && root.right == null)
				return null;
			else if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else {
				BinaryTreeNode<Integer> minNode = root.right;
				while(minNode.left != null) {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = delete(root.right,minNode.data);
				return root;
			}
		}
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		String s = root.data + ":";

		if (root.left != null)
			s += "L:" + root.left.data;
		if (root.right != null)
			s += ",R:" + root.right.data;

		System.out.println(s);

		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		root = insert(root, 8);
		root = delete(root, 7);
		//System.out.println(search(root, 8));
		 printTree(root);
	}

}
