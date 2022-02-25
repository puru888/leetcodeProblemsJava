package Trees;

import java.util.Scanner;

public class TreeUse {

	public static TreeNode<Integer> takeInput(Scanner sc) {

		System.out.println("Enter next Node:");
		int data = sc.nextInt();

		TreeNode<Integer> root = new TreeNode<Integer>(data);
		System.out.println("Enter number of child for " + data + ": ");
		int childCount = sc.nextInt();

		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(sc);
			root.children.add(child);
		}

		return root;
	}

	public static void print(TreeNode<Integer> root) {
		String s = root.data + " : ";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}

	public static TreeNode<Integer> takeInputLevelwise(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root data:");
		int rootData = sc.nextInt();
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter num of children of "+frontNode.data);
			int numOfChildren = sc.nextInt();
			
			for (int i = 0; i < numOfChildren; i++) {
				System.out.println("Enter "+(i+1)+" th child of "+frontNode.data);
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
				
			}
		}
		return root;
	}

	public static void printLevelwise(TreeNode<Integer> root) {
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			String s = frontNode.data + " : ";
			for (int i = 0; i < frontNode.children.size(); i++) {
				s = s + frontNode.children.get(i).data +",";
				pendingNodes.enqueue(frontNode.children.get(i));
			}
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//TreeNode<Integer> root = takeInput(sc);
		TreeNode<Integer> root = takeInputLevelwise();
		printLevelwise(root);
	}

}
