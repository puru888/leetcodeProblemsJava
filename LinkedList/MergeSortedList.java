package LinkedList;

import java.awt.print.Printable;
import java.util.Scanner;

public class MergeSortedList {

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

	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2)
	{
		
		if(head2 == null)
			return head1;
		if(head1 == null)
			return head2;
		
		Node<Integer> newNode = null, tail = null;
		
			if(head1.data < head2.data)
			{
				newNode= head1;
				tail = newNode;
				head1 = head1.next;
			}
			else
			{
				newNode = head2;
				tail = newNode;
				head2 = head2.next;
			}

	while(head1!=null && head2!=null)

	{
		if (head1.data < head2.data) {
			tail.next = head1;
			tail = head1;
			head1 = head1.next;
		} else {
			tail.next = head2;
			tail = head2;
			head2 = head2.next;
		}
	}

	if(head1!=null)tail.next=head1;
	if(head2!=null)tail.next=head2;

	return newNode;
}

	public static void print(Node<Integer> head)
	{
		if(head == null)
		{
			System.out.println();
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> head3 = merge(head1, head2);
		print(head3);
	}

}
