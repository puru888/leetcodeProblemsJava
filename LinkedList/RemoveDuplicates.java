package LinkedList;

import java.util.Scanner;

public class RemoveDuplicates {

	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null,tail=null;
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
	
		while(data != -1)
		{
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
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

	public static Node<Integer> removeDuplicates(Node<Integer> head)
	{
		Node<Integer> temp = head;
		while(temp != null && temp.next != null)
		{
			if(temp.data.equals(temp.next.data))
			{
				temp.next = temp.next.next;
				temp = temp.next;
			}
			else
				temp = temp.next;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = removeDuplicates(head);
		print(head);
	}

}
