package Tree_BinarySearch;

import java.util.Scanner;
import java.util.Stack;

public class PairSumInBST {

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
	};

	public static int nodeCount(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;

		return nodeCount(root.left) + nodeCount(root.right) + 1;
	}

	public static void printSum(BinaryTreeNode<Integer> root, int s) {
		if (root == null)
			return;

		int totalCount = nodeCount(root);
		int count = 0;

		Stack<BinaryTreeNode<Integer>> inorder = new Stack<>();
		Stack<BinaryTreeNode<Integer>> revInorder = new Stack<>();

		BinaryTreeNode<Integer> temp = root;
		while (temp != null) {
			inorder.push(temp);
			temp = temp.left;
		}
		temp = root;
		while (temp != null) {
			revInorder.push(temp);
			temp = temp.right;
		}

		while (count < totalCount - 1) {
			BinaryTreeNode<Integer> top1 = inorder.peek();
			BinaryTreeNode<Integer> top2 = revInorder.peek();
			if (top1.data + top2.data == s) {
				System.out.println(top1.data + " " + top2.data);

				BinaryTreeNode<Integer> top = top1;
				inorder.pop();
				count++;
				if (top.right != null) {
					top = top.right;
					while (top != null) {
						inorder.push(top);
						top = top.left;
					}
				}
				top = top2;
				revInorder.pop();
				count++;
				if (top.left != null) {
					top = top.left;
					while (top != null) {
						revInorder.push(top);
						top = top.right;
					}
				}
			} else if (top1.data + top2.data > s) {
				BinaryTreeNode<Integer> top = top2;
				revInorder.pop();
				count++;
				if (top.left != null) {
					top = top.left;
					while (top != null) {
						revInorder.push(top);
						top = top.right;
					}
				}
			} else {
				BinaryTreeNode<Integer> top = top1;
				inorder.pop();
				count++;
				if (top.right != null) {
					top = top.right;
					while (top != null) {
						inorder.push(top);
						top = top.left;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		printSum(root, 15);
	}

}
