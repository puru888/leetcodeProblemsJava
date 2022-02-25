package Trees;

import java.util.Iterator;
import java.util.Scanner;

public class NodeHavingSumOfChildrenNNodeIsMax {

	public static TreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root node:");
		int rootData = sc.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter number of child for:" + frontNode.data);
			int numOfChild = sc.nextInt();
			for (int i = 0; i < numOfChild; i++) {
				System.out.println("Enter " + (i + 1) + " child for " + frontNode.data);
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}

		return root;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
	}

}
