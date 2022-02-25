package Tree_BinarySearch;

import java.util.Scanner;

public class chkBST1 {

	public static BinaryTreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
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

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if (root == null)
			return true;

		int leftMax = maximum(root.left);
		int rightMin = minimum(root.right);

		if (root.data <= leftMax || root.data > rightMin)
			return false;

		return isBST(root.left) && isBST(root.right);
	}

	private static int minimum(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if (root == null)
			return Integer.MAX_VALUE;

		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}

	private static int maximum(BinaryTreeNode<Integer> root) {
		if (root == null)
			return Integer.MIN_VALUE;

		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}

	public static Pair<Boolean,Pair<Integer,Integer>> isBST1(BinaryTreeNode<Integer> root){
		if(root == null) {
			Pair<Boolean,Pair<Integer,Integer>> output = new Pair<>();
			output.first = true;
			output.second = new Pair<Integer,Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;
			return output;
		}
		Pair<Boolean,Pair<Integer,Integer>> leftOutput = isBST1(root.left);
		Pair<Boolean,Pair<Integer,Integer>> rightOutput = isBST1(root.right);
		
		int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
		int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
		
		boolean isBST = (root.data > leftOutput.second.second 
				&& root.data < rightOutput.second.first)
				&& (leftOutput.first && rightOutput.first);
		
		Pair<Boolean,Pair<Integer,Integer>> output = new Pair<>();
		output.first = isBST;
		output.second = new Pair<>();
		output.second.first = min;
		output.second.second = max;
		
		return output;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		Pair<Boolean,Pair<Integer,Integer>> ans = isBST1(root);
		System.out.println(ans.first);
	}

}

class Pair<T,V>{
	T first;
	V second;
}
