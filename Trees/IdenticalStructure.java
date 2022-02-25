package Trees;

import java.util.Scanner;

public class IdenticalStructure {

	public static TreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			int numOfChild = sc.nextInt();
			for (int i = 0; i < numOfChild; i++) {
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}
	
	public static boolean isIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2)
	{
		if(root1 == null || root2 == null)
			return false;
		
		if(root1.data != root2.data)
			return false;

		boolean ans = true;
		for (int i = 0; i < root1.children.size(); i++) {
			ans = isIdentical(root1.children.get(i), root2.children.get(i));
			if(!ans)
				return false;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root1 = takeInput();
		TreeNode<Integer> root2 = takeInput();
		System.out.println(isIdentical(root1, root2));
	}

}
