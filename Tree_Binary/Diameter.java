package Tree_Binary;

import java.util.Scanner;

public class Diameter {

	public static BinaryTreeNode<Integer>takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
		int data = sc.nextInt();
		if(data == -1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter left child of "+front.data);
			int leftChild = sc.nextInt();
			if(leftChild != -1)
			{
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			System.out.println("Enter right child of "+front.data);
			int rightChild = sc.nextInt();
			if(rightChild != -1)
			{
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		
		return root;
	}

	public static int diameter(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return 0;
		
		int option1 = height(root.left) + height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);
		
		return Math.max(option1,Math.max(option2, option3));
	}
	
	public static int height(BinaryTreeNode<Integer> root)
	{
		if(root == null)
			return 0;
		
		return 1 + Math.max(height(root.left), height(root.right));
		
	}
	
	public static Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer>root){
		if(root == null)
		{
			Pair<Integer,Integer> output = new Pair<>();
			output.first = 0;
			output.second = 0;
			return output;
		}
		Pair<Integer,Integer> lo = heightDiameter(root.left);
		Pair<Integer,Integer> ro = heightDiameter(root.right);
		int height = 1 + Math.max(lo.first, ro.first);
		int option1 = lo.first+ro.first;
		int option2 = lo.second;
		int option3 = ro.second;
		int diameter = Math.max(option1, Math.max(option2, option3));
		
		Pair<Integer,Integer> output = new Pair<>();
		output.first = height;
		output.second = diameter;
		
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		System.out.println(diameter(root));
	}

}

class Pair<T,V>{
	T first;
	V second;
}
