package LinkedList;

import java.util.Scanner;

public class Kreverse {

	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}

			data = sc.nextInt();
		}

		return head;
	}

	public static void print(Node<Integer> head) {
		if (head == null)
			return;

		System.out.print(head.data + " ");
		print(head.next);
	}

	public static Node<Integer> kReverse(Node<Integer> head, int n) {

		if (n == 0 || n == 1)
			return head;

		int count = 0;
		Node<Integer> current = head;
		Node<Integer> fwd = null;
		Node<Integer> prev = null;

		while (count < n && current != null) {
			fwd = current.next;
			current.next = prev;
			prev = current;
			current = fwd;
			count++;
		}

		if (fwd != null)
			head.next = kReverse(fwd, n);

		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = kReverse(head, 3);
		print(head);
	}

}
