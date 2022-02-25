package LinkedList;

import java.util.Scanner;

public class MidPoint {
	
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
	
	public static int midPoint(Node<Integer> head)
	{
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		
		}
		
		return slow.data;
		
		//1 2 3 4 5 6 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		System.out.println(midPoint(head));
	}

}
