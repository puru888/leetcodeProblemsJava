package Tree_BinarySearch;

import java.util.Scanner;

public class LCAofBST {

	public static BinaryTreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
		int data = sc.nextInt();
		if(data == - 1){
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

	public static BinaryTreeNode<Integer> LCA(BinaryTreeNode<Integer> root,int m1,int m2){
		if(root == null || root.data == m1 || root.data == m2 )
			return root;
		
		if(root.data < m1 && root.data < m2)
			return LCA(root.right, m1, m2);
		if(root.data > m1 && root.data > m2 )
			return LCA(root.left, m1, m2);
		
		BinaryTreeNode<Integer> leftLCA = LCA(root.left, m1, m2);
		BinaryTreeNode<Integer> rightLCA = LCA(root.right,m1,m2);
		
		if(leftLCA != null && rightLCA != null)
			return root;
		else if(leftLCA != null)
			return leftLCA;
		
		return rightLCA;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		BinaryTreeNode<Integer> op = LCA(root, 20, 70);
		System.out.println(op == null ? -1 : op.data);
				
		
	}

}
