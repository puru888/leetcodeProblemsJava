package Tree_BinarySearch;

public class BSTFrmSortedArr {

	public static BinaryTreeNode<Integer> constructBST(int input[],int sI,int eI){
		if(sI > eI)
			return null;
		int mid = (sI+eI)/2;
		int data = input[mid];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left = constructBST(input, sI, mid-1);
		root.right = constructBST(input, mid+1, eI);
		return root;
	}
	
	public static void printBST(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			String s = front.data + " : ";
			if(front.left != null) {
				s += front.left.data + " ";
				pendingNodes.enqueue(front.left);
			}
			if(front.right != null) {
				s += front.right.data;
				pendingNodes.enqueue(front.right);
			}
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		BinaryTreeNode<Integer> root = constructBST(arr, 0, arr.length-1);
		printBST(root);
	}

}
