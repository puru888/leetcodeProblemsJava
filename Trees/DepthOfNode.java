package Trees;

import java.util.Scanner;

public class DepthOfNode {

	public static TreeNode<Integer> takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root element:");
		int rootData = sc.nextInt();
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty())
		{
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter number of children for:"+frontNode.data);
			int numOfChild = sc.nextInt();
			for(int i = 0; i < numOfChild; i++)
			{
				System.out.println("Enter "+(i+1)+" child for "+frontNode.data);
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		
		return root;
	}

	public static void printAtK(TreeNode<Integer> root,int k)
	{
		if(k < 0)
			return;
		if(k == 0)
		{
			System.out.println(root.data);
			return;
		}
		
		for(int i = 0; i < root.children.size(); i++)
		{
			printAtK(root.children.get(i),k-1);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		printAtK(root, 2);
	}

}
