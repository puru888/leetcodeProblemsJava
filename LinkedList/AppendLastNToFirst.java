package LinkedList;

import java.util.Scanner;

public class AppendLastNToFirst {

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

	public static int LengthIterative(Node<Integer> head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int pos) {
		Node<Integer> temp1 = head;
		Node<Integer> temp2 = head;
		int length = LengthIterative(head);
		int i = 0;
		while (i < length - pos - 1) {
			temp1 = temp1.next;
			i++;
		}
		head = temp1.next;
		temp1.next = null;
		Node<Integer> tempHead = head;
		while (tempHead.next != null) {
			tempHead = tempHead.next;
		}
		tempHead.next = temp2;
		return head;
	}

	public static void print(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = appendLastNToFirst(head, 7);
		print(head);
	}

}
