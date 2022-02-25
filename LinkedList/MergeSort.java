package LinkedList;

import java.util.Scanner;

public class MergeSort {

	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null,tail = null;
		
		Scanner sc = new Scanner(System.in);
		
		int data = sc.nextInt();
		
		while(data != -1)
		{
			Node<Integer> newNode = new Node<Integer>(data);
			
			if(head == null)
			{
				head = newNode;
				tail = newNode;
			}
			else
			{
				tail.next = newNode;
				tail = newNode;
			}
			
			data = sc.nextInt();
		}
		
		return head;
	}

	public static void print(Node<Integer>head)
	{
		if(head == null)
		{
			System.out.println();
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);
	}

	public static Node<Integer> mid(Node<Integer> head)
	{
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}

	public static Node<Integer> sort(Node<Integer> head)
	{
		if(head == null || head.next == null)
			return head;
		
		Node<Integer> mid = mid(head);
		
		Node<Integer> half1 = head;
		Node<Integer> half2 = mid.next;
		mid.next = null;
		
		half1 = sort(half1);
		half2 = sort(half2);
		
		Node<Integer> newHead = merge(half1, half2);
		
		return newHead;
	}
	
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2)
	{
		if(head2 == null)
			return head1;
		if(head1 == null)
			return head2;
		
		Node<Integer> newHead = null, newTail = null; 
		
		if(head1.data < head2.data)
		{
			newHead = head1;
			newTail = head1;
			head1 = head1.next;	
		}
		else
		{
			newHead = head2;
			newTail = head2;
			head2 = head2.next;
		}
		
		while(head1 != null && head2 != null)
		{
			if(head1.data < head2.data)
			{
				newTail.next = head1;
				newTail = head1;
				head1 = head1.next;	
			}
			else
			{
				newTail.next = head2;
				newTail = head2;
				head2 = head2.next;
			}
				
		}
		
		if(head1 != null) newTail.next = head1;
		if(head2 != null) newTail.next = head2;
		
		return newHead;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = sort(head);
		print(head);
	}

}
