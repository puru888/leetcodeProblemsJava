package Tree_BinarySearch;

import java.util.Scanner;

public class ElemBtwnK1nK2 {

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

	public static void elements(BinaryTreeNode<Integer> root,int k1,int k2) {
		if(root == null)
			return;
		
		elements(root.left, k1, k2);
		
		if(root.data >= k1 && root.data <= k2) 
			System.out.print(root.data+" ");
		
		elements(root.right, k1, k2);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		elements(root, 6, 10);
	}

}
