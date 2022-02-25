package Trees;

import java.util.Scanner;

public class NodeWithLargestData {

	public static TreeNode<Integer> takeInput(Scanner sc)
	{
		System.out.println("Enter next root");
		int data = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(data);
		
		System.out.println("Enter number of children for:"+data);
		int numChildren = sc.nextInt();
		
		for (int i = 0; i < numChildren; i++) {
			TreeNode<Integer> child = takeInput(sc);
			root.children.add(child);
		}
		return root;
	}

	public static int largest(TreeNode<Integer> root)
	{
		if(root == null)
			return Integer.MIN_VALUE;
		
		int ans = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			int childLargest = largest(root.children.get(i));
			if(childLargest > ans)
				ans = childLargest;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeNode<Integer> root = takeInput(sc);
		System.out.println(largest(root));
	}

}
