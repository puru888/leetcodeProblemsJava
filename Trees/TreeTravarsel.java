package Trees;

import java.util.Scanner;

public class TreeTravarsel {

	public static TreeNode<Integer> takeInput() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root element:");
		int rootData = sc.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter number of child for:" + root.data);
			int numOfChild = sc.nextInt();
			for (int i = 0; i < numOfChild; i++) {
				System.out.println("Enter " + (i + 1) + " child for " + root.data);
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}

	public static void preOrder(TreeNode<Integer> root)
	{
		if(root == null)
			return;
		System.out.print(root.data+" ");
		for (int i = 0; i < root.children.size(); i++) {
			preOrder(root.children.get(i));
		}
	}

	public static void postOrder(TreeNode<Integer> root) {
		if(root == null)
			return;
		
		for (int i = 0; i < root.children.size(); i++) {
			postOrder(root.children.get(i));
		}
		
		System.out.println(root.data);
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		//preOrder(root);
		postOrder(root);
	}

}
