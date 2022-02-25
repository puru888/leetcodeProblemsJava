package Tree_BinarySearch;

import java.util.ArrayList;
import java.util.Scanner;

public class RootToNodePath {

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

	public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root,int elem){
		if(root == null)
			return null;
		
		if(root.data == elem) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput = rootToNodePath(root.left, elem);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		ArrayList<Integer> rightOutput = rootToNodePath(root.right, elem);
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		else
			return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		ArrayList<Integer> op = rootToNodePath(root, 2);
		for (int i = 0; i < op.size(); i++) {
			System.out.print(op.get(i)+" ");
		}
	}

}
