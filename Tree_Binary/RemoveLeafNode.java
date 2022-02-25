package Tree_Binary;

import java.util.Scanner;

public class RemoveLeafNode {

	public static BinaryTreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
		int data = sc.nextInt();
		if(data == -1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
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
	
	public static void removeLeafNode(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		pendingNodes.enqueue(null);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			if(front != null) {
				if(front.left != null && front.right != null || front.left == null && front.right != null || front.left != null && front.right == null)
					System.out.print(front.data+" ");
				if(front.left != null)
					pendingNodes.enqueue(front.left);
				if(front.right != null)
					pendingNodes.enqueue(front.right);
			}
			else if(front == null) {
				System.out.println();
				if(!pendingNodes.isEmpty())
					pendingNodes.enqueue(null);
			}

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		removeLeafNode(root);
	}

}
