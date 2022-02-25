package Trees;

import java.util.Iterator;
import java.util.Scanner;

public class CountLeafNodes {

	public static TreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root element:");
		int rootData = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(rootData);

		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter number of children for:" + frontNode.data);
			int numChild = sc.nextInt();

			for (int i = 0; i < numChild; i++) {
				System.out.println("Enter " + (i + 1) + " children for " + frontNode.data);
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}

		}
		return root;
	}

	public static int countLeaf(TreeNode<Integer> root)
	{
		if(root == null)
			return 0;
		
		if(root.children.size() == 0)
			return 1;
		
		int ans = 0;
		
		for (int i = 0; i < root.children.size(); i++) {
			ans += countLeaf(root.children.get(i));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		System.out.println(countLeaf(root));
	}

}
