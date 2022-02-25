package Trees;

import java.util.Scanner;

public class SumOfAllNodes {

	public static TreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root element:");
		int rootData = sc.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter num of child for: " + frontNode.data);
			int numOfChild = sc.nextInt();
			for (int i = 0; i < numOfChild; i++) {
				System.out.println("Enter " + (i + 1) + " child for" + frontNode.data);
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}

	public static int sumOfNode(TreeNode<Integer> root)
	{
		if(root == null)
			return -1;
		
		int ans = root.data;
		
		for (int i = 0; i < root.children.size(); i++) {
			ans += sumOfNode(root.children.get(i));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		System.out.println(sumOfNode(root));
	}

}
