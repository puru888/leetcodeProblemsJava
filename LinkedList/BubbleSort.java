package LinkedList;

import java.util.Scanner;

public class BubbleSort {

	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null,tail = null;
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1)
		{
			Node<Integer> newNode = new Node<>(data);
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

	public static void print(Node<Integer> head)
	{
		if(head == null)
			return;
		
		System.out.print(head.data+" ");
		print(head.next);
	}

	private static int length(Node<Integer> head)
	{
		int count = 0;
		while(head != null)
		{
			head = head.next;
			count++;
		}
		return count;
	}

	public static Node<Integer> bubbleSore(Node<Integer> head)
	{
		int n = length(head);
		
		for (int i = 0; i < n-1; i++) {
			Node<Integer> prev = null;
			Node<Integer> curr = head;
			
			for (int j = 0; j < n-i-1; j++) {
				if(curr.data <= curr.next.data)
				{
					prev = curr;
					curr = curr.next;
				}
				else {
					if(prev == null)
					{
						Node<Integer> fwd = curr.next;
						head = head.next;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					}
					else
					{
						Node<Integer> fwd = curr.next;
						prev.next = fwd;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					}
				}
			}
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = bubbleSore(head);
		print(head);
	}

}
