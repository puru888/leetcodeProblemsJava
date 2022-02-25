package Trees;

import java.util.Scanner;

public class NumOfNodesGreaterThanX {

	public static TreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root Element:");
		int rootData = sc.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty())
		{
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter number of children for:"+frontNode.data);
			int numOfChild = sc.nextInt();
			for(int i = 0; i < numOfChild; i++) {
				System.out.println("Enter "+(i+1)+" child for "+frontNode.data);
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		return root;
	}
	
	public static int countNodesGreaterX(TreeNode<Integer> root, int x)
	{
		if(root == null)
			return -1;
		
		if(root.data > x)
			return 1;
		
		int ans = 0;
		for (int i = 0; i < root.children.size(); i++) {
			ans += countNodesGreaterX(root.children.get(i), x);
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		System.out.println(countNodesGreaterX(root, 5));
		
	}

}
