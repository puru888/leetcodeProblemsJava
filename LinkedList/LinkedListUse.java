package LinkedList;

import java.util.Scanner;

public class LinkedListUse {

	public static Node<Integer> takeInput()
	{
		Node<Integer> head = null, tail = null;
		
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
//				Node<Integer> temp = head;
//				while(temp.next != null)
//				{
//					temp = temp.next;   time complexity = n square; use better sol
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode; //time complexity = n;
				
			}
			data = sc.nextInt();
		}
		
		return head;
	}
	
	public static void print(Node<Integer> head)
	{
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		
		System.out.println();
	}
	
	public static void printRec(Node<Integer> head)
	{
		if(head == null)
			return;
		
		System.out.print(head.data+" ");
		
		print(head.next);
	}
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos)
	{
		Node<Integer> newNode = new Node<>(data);
		
		if(pos == 0)
		{
			newNode.next = head;
			return newNode;
		}
		
		int i = 0;
		Node<Integer> temp = head;
		
		while(i < pos-1)
		{
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
		return head;
	}

	public static Node<Integer> insertRec(Node<Integer> head, int data, int pos)
	{
		if(head == null && pos > 0)
		{
			return head;
		}
		
		if(pos == 0)
		{
			Node<Integer> newHead = new Node<Integer>(data);
			newHead.next = head;
			return newHead;
		}
		else
		{
			head.next = insert(head.next, data, pos-1);
			return head;
		}
		
		
	}
	
	public static Node<Integer> delete(Node<Integer> head, int pos)
	{
		int i = 0;
		Node<Integer> temp = head;
		
		if(pos == 0)
		{
			head = temp.next;
			return head;
		}
		
		while(i < pos-1)
		{
			temp = temp.next;
			i++;
		}
		if(temp.next == null)
			return head;
		else
			temp.next = temp.next.next;
		
		return head;
	}

	public static Node<Integer> deleteRec(Node<Integer> head,int pos)
	{
		if(pos == 0)
		{
			head = head.next;
			return head;
		}
		else
		{
			return head.next = delete(head.next, pos-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = takeInput();
		head = insertRec(head, 8, 2);
		printRec(head);
		head = deleteRec(head, 3);
		printRec(head);
		//head = insert(head, 80, 2);
		//print(head);
		//head = delete(head, 4);
		//print(head);
		
		
//		Node<Integer> node1 = new Node<Integer>(10);
//		Node<Integer> node2 = new Node<>(20);
//		Node <Integer> node3 = new Node<>(30);
//		
//		Node<Integer> head = node1;
//		node1.next = node2;
//		node2.next = node3;
	}

}
