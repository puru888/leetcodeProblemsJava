package Trees;

import java.util.Scanner;

public class NumOfNodes {

	public static TreeNode<Integer> takeInput(Scanner sc) {

		System.out.println("Enter next root");
		int rootData = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(rootData);

		System.out.println("Enter number of children for," + rootData);
		int numChildren = sc.nextInt();
		
		for (int i = 0; i < numChildren; i++) {
			TreeNode<Integer> childNode = takeInput(sc);
			root.children.add(childNode);
		}

		return root;
	}

	public static int countNode(TreeNode<Integer> root)
	{
		int count = 1;
		for (int i = 0; i < root.children.size(); i++) {
			count += countNode(root.children.get(i));
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		TreeNode<Integer> root = takeInput(sc);
		System.out.println(countNode(root));
	}
}
