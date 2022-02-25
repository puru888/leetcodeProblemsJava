package Tree_Binary;

public class ConstructTreeFromPreNInOrder {

	private static BinaryTreeNode<Integer> buildTree(int in[], int pre[], int inS, int inE, int preS, int preE) {

		if (preS > preE)
			return null;

		int rootData = pre[preS];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

		int rootIndex = -1;

		for (int i = 0; i <= inE; i++) {
			if (in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		if (rootIndex == -1)
			return null;

		int leftInS = inS;
		int leftInE = rootIndex - 1;
		int leftPreS = preS + 1;
		int leftPreE = leftInE - leftInS + leftPreS;
		int rightInS = rootIndex + 1;
		int rightInE = inE;
		int rightPreS = leftPreE + 1;
		int rightPreE = preE;

		root.left = buildTree(in, pre, leftInS, leftInE, leftPreS, leftPreE);
		root.right = buildTree(in, pre, rightInS, rightInE, rightPreS, rightPreE);

		return root;

	}

	public static BinaryTreeNode<Integer> buildTree(int in[], int pre[]) {
		return buildTree(in, pre, 0, in.length - 1, 0, pre.length - 1);
	}

	public static void print(BinaryTreeNode<Integer> root) {
		QueueUsingLL<BinaryTreeNode> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.dequeue();
			String s = front.data + ": ";
			if (front.left != null) {
				s += "L: " + front.left.data + " ";
				pendingNodes.enqueue(front.left);
			} else
				s += "L: " + -1 + " ";
			if (front.right != null) {
				s += "R: " + front.right.data;
				pendingNodes.enqueue(front.right);
			} else
				s += "R: " + -1;

			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = { 4, 2, 5, 1, 3, 7 };
		int pre[] = { 1, 2, 4, 5, 3, 7 };

		BinaryTreeNode<Integer> root = buildTree(in, pre);
		print(root);
	}

}
