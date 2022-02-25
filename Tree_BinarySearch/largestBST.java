package Tree_BinarySearch;

import java.util.Scanner;

class bstSubTree {
	int max;
	int min;
	int height;
	boolean isBST;
}

public class largestBST {

	public static BinaryTreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root:");
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
	
	public static bstSubTree largestBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			bstSubTree output = new bstSubTree();
			output.min = Integer.MAX_VALUE;
			output.max = Integer.MIN_VALUE;
			output.isBST = true;
			output.height = 0;
			return output;
		}
		
		bstSubTree left = largestBST(root.left);
		bstSubTree right = largestBST(root.right);
		
		if(!(right.isBST && right.min > root.data))
			right.isBST = false;
		if(!(left.isBST && left.max < root.data))
			left.isBST = false;
		
		if(!left.isBST || !right.isBST || root.data < left.max || root.data > right.min) {
			if(left.height > right.height) {
				left.isBST = false;
				return left;
			}else {
				right.isBST = false;
				return right;
			}
		}
		bstSubTree op = new bstSubTree();
		op.isBST = true;
		op.min = Math.min(left.min, Math.min(right.min, root.data));
		op.max = Math.max(left.max, Math.max(right.max, root.data));
		op.height = Math.max(left.height, right.height)+1;
		return op;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root =takeInput();
		bstSubTree ans = largestBST(root);
		System.out.println(ans.height);
	}

}

