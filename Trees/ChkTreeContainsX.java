package Trees;

import java.util.Scanner;

public class ChkTreeContainsX {

	public static TreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter root element:");
		int rootData = sc.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter number of children for:" +frontNode.data );
			int numOfChild = sc.nextInt();
			for (int i = 0; i < numOfChild; i++) {
				System.out.println("Enter "+(i+1)+" child for:"+frontNode.data);
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}
	
	public static boolean isPresent(TreeNode<Integer> root,int x)
	{
		if(root == null)
			return false;
		
		if(root.data == x)
			return true;
		
		boolean ans = false;
		for (int i = 0; i < root.children.size(); i++) {
			ans = isPresent(root.children.get(i), x);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		System.out.println(isPresent(root, 40));
		System.out.println(isPresent(root, 4));
	}

}
