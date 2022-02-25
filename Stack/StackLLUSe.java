package Stack;

import java.util.Iterator;

public class StackLLUSe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingLL<Integer> stack = new StackUsingLL<>();

		Node<Integer> head = null;
		for (int i = 1; i <= 5; i++) {
			head = stack.push(i);
		}
//		while (head.next != null) {
//			System.out.println(head.data);
//			head = head.next;
//		}

		// System.out.println(stack.size());
		// System.out.println(stack.top());
		// stack.pop();
		// System.out.println(stack.top());

		System.out.println(stack.isEmpty());
	}

}
