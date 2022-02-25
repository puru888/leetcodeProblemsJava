package Tree_BinarySearch;

import java.util.Scanner;

public class replaceSumOfGreaterNode {

	public static BinaryTreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
		int data = sc.nextInt();
		if(data == -1) {
			sc.close();
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter left child of "+root.data);
			int left = sc.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(left);
				pendingNodes.enqueue(child);
				front.left = child;
 			}
			System.out.println("Enter right child of "+root.data);
			int right = sc.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(right);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		
		sc.close();
		return root;
	}

	public static int replaceSum(BinaryTreeNode<Integer> root, int sum) {
		if(root == null)
			return sum;
		
		sum = replaceSum(root.right, sum);
		sum += root.data;
		root.data = sum;
		sum = replaceSum(root.left, sum);
		return sum;
		
	}
	public static void print(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			String s = root.data+" ";
			if(front.left != null) {
				s += front.left.data+ " ";
				pendingNodes.enqueue(front.left);
			}
			if(front.right != null) {
				s += front.right.data;
				pendingNodes.enqueue(front.right);
			}
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		replaceSum(root, 0);
		print(root);
		
	}

}
