package LinkedList;

import java.util.Scanner;

public class DeleteEveryNNode {

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

	public static Node<Integer> deleteN(Node<Integer> head,int m, int n)
	{
		
		if(head == null && m == 0)
			return null;
		
		if(n == 0)
			return head;
		
		Node<Integer> currentNode = head;
		Node<Integer> temp = null;
		
		while(currentNode != null)
		{
			int take = 0;
			int skip = 0;
			
			while(currentNode != null && take < m)
			{
				if(temp == null)
					temp = currentNode;
				else
				{
					temp.next = currentNode;
					temp = currentNode;
				}
				
				currentNode = currentNode.next;
				take++;
			}
			
			while(currentNode != null && skip < n)
			{
				currentNode = currentNode.next;
				skip++;
			}
			
			if(temp != null)
				temp.next = null;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = deleteN(head,2,3);
		print(head);
	}

}
