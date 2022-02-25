package Tree_BinarySearch;

import java.util.Scanner;

public class createNInsertDuplicateNode {

	public static BinaryTreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
		int data = sc.nextInt();
		if(data == -1)
		{
			sc.close();
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter left child of "+front.data);
			int left = sc.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(left);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			System.out.println("Enter right child of "+front.data);
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
	
	public static void insertDuplicate(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		
		insertDuplicate(root.left);
		
		int duplicateData = root.data;
		BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<>(duplicateData);
		BinaryTreeNode<Integer> temp = root.left;
		root.left = duplicateNode;
		duplicateNode.left = temp;
		duplicateNode.right = root.right;
		
	}

	public static void print(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			String s = "";//front.data+": ";
			
			if(front.left != null) {
				s += "L: "+front.left.data+",";
				pendingNodes.enqueue(front.left);
			}
			
			if(front.right != null) {
				s += "R: "+front.right.data;
				pendingNodes.enqueue(front.right);
			}
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		insertDuplicate(root);
		print(root);
	}

}
