package Tree_Binary;

import java.util.ArrayList;
import java.util.Scanner;

public class LevelwiseLL {

	public static BinaryTreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
		int data = sc.nextInt();
		if(data == -1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter left child of "+front.data);
			int leftChild = sc.nextInt();
			if(leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			System.out.println("Enter right child of "+ front.data);
			int rightChild = sc.nextInt();
			if(rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		
		return root;
	}

	public static void printLvlWiseLL(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		ArrayList<BinaryTreeNode<Integer>> list = new ArrayList<>();
		pendingNodes.enqueue(root);
		pendingNodes.enqueue(null);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			if(front == null) {
				//System.out.println();
				if(!pendingNodes.isEmpty()) {
					pendingNodes.enqueue(null);
				}
			}
			else {
				Node<BinaryTreeNode<Integer>> node = new Node<>(front);
				Node<BinaryTreeNode<Integer>> nextNode = new Node<>(pendingNodes.front());
				node.next = nextNode;
	
				//if(pendingNodes.front() != nextNode.data)
					list.add(node.data);
				//System.out.print(front.data+" ");
				if(front.left != null) {
					pendingNodes.enqueue(front.left);
				}
				if(front.right != null) {
					pendingNodes.enqueue(front.right);
				}
			}
		}
		int i = 0;
		while(list.size() > i) {
			System.out.print(list.get(i).data+" ");
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInput();
		printLvlWiseLL(root);
	}

}


