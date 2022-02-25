package LinkedList;

import java.util.Scanner;

public class FindANode {

	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);

			if (head == null) {
				head = newNode;
				tail = newNode;
			}

			else {
				tail.next = newNode;
				tail = tail.next;
			}

			data = sc.nextInt();
		}

		return head;

	}

	public static int find(Node<Integer> head, int elem) {
		int k = 0;

		while (head.data != elem) {
			if (head.next == null)
				return -1;
			else {

				head = head.next;
				k++;
			}
		}

		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		System.out.println(find(head, 10));
	}

}
