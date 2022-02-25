package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class EvenAfterOdd {

	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null, tail = null;
		
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

	public static Node<Integer> eveAftOdd(Node<Integer> head)
	{
		Node<Integer> oddH = null;
		Node<Integer> oddT = null;
		Node<Integer> evenH = null;
		Node<Integer> evenT = null;
		
		while (head != null) {
			if(head.data % 2 != 0 && oddH == null)
			{
				oddH = head;
				oddT = head;
			}
			else if(head.data % 2 != 0 && oddH != null)
			{
				oddT.next = head;
				oddT = head;
			}
			else if(head.data % 2 == 0 && evenH == null)
			{
				evenH = head;
				evenT = head;
			}
			else
			{
				evenT.next = head;
				evenT = head;
			}
			
			head = head.next;	
		}
		
		oddT.next = evenH;
		evenT.next = null;
		
		return oddH;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		head = eveAftOdd(head);
		print(head);
	}
}
