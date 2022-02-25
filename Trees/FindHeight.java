package Trees;

import java.util.Queue;
import java.util.Scanner;

public class FindHeight {

	public static TreeNode<Integer> takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root:");
		int data = sc.nextInt();
		TreeNode<Integer> root = new TreeNode<>(data);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.dequeue();
			System.out.println("Enter number of children: ");
			int numOfChild = sc.nextInt();
			for (int i = 0; i < numOfChild; i++) {
				System.out.println("Enter no " + (i + 1) + " child for " + front.data);
				int childData = sc.nextInt();
				TreeNode<Integer> child = new TreeNode<>(childData);
				front.children.add(child);
				pendingNodes.enqueue(child);
			}
		}

		return root;
	}

	public static void print(TreeNode<Integer> root) {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.dequeue();
			String s = front.data + " : ";
			for (int i = 0; i < front.children.size(); i++) {
				s += front.children.get(i).data + ",";
				pendingNodes.enqueue(front.children.get(i));
			}
			System.out.println(s);
		}
	}

	public static void height(TreeNode<Integer> root) {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		pendingNodes.enqueue(null);
		int i = 1;
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.dequeue();
			if (front == null) {
				i++;
				if (!pendingNodes.isEmpty()) {
					pendingNodes.enqueue(null);
				}
			} else {
				for (int j = 0; j < front.children.size(); j++) {
					if(front.children.get(i) != null)
						pendingNodes.enqueue(front.children.get(i));
				}
			}
		}
		
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInput();
		//print(root);
		height(root);
	}

}
