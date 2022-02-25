package Tree_Binary;

import java.util.Scanner;

public class Travarsel {

	public static BinaryTreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
		int data = sc.nextInt();
		if(data == -1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter left child of "+front.data);
			int leftChild = sc.nextInt();
			if(leftChild != -1)
			{
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			System.out.println("Enter right child of "+front.data);
			int rightChild = sc.nextInt();
			if(rightChild != -1)
			{
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		
		return root;
	}
	
	public static void preOrder(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void postOrder(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}

	public static void inOrder(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		inOrder(root);
	}

}
