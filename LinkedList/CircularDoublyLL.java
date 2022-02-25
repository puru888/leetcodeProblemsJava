package LinkedList;

import java.util.Scanner;

public class CircularDoublyLL {
	
	public static doubleNode takeInput()
	{
		doubleNode dn = new doubleNode();
		
		dn.head = null; 
		dn.tail = null;
		
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1)
		{
			NodeLL<Integer> newNode = new NodeLL(data);
			if(dn.head == null)
			{
				dn.head = newNode;
				dn.tail = newNode;
			}
			else
			{
				dn.tail.next = newNode;
				newNode.previous = dn.tail;
				dn.tail = newNode;
				newNode.next = null;
			}
			
			data = sc.nextInt();
		}
		
		dn.tail.next = dn.head;
		dn.head.previous = dn.tail;
		
		return dn;
	}
	
	public static void printNext(NodeLL<Integer> head)
	{
		if(head == null)
		{
			System.out.println();
			return;
		}
		
		System.out.print(head.data+" ");
		 printNext(head.next);
	}
	
	public static void printPrev(NodeLL<Integer> head)
	{
		if(head == null)
		{
			System.out.println();
			return;
		}
		
		System.out.print(head.data+" ");
		printPrev(head.previous);
	}

	public static void print(NodeLL<Integer> head)
	{
		NodeLL<Integer> temp = head;
		do {
			System.out.print(temp.data+" ");
			temp = temp.next;
		} while (temp != head);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleNode dn = takeInput();
		//printNext(dn.head);
		//printPrev(dn.tail);
		print(dn.head);
	}

}

class NodeLL<T>
{
	T data;
	NodeLL<T> next;
	NodeLL<T> previous;
	
	NodeLL(T data)
	{
		this.data = data;
		next = null;
		previous = null;
	}
}

class doubleNode
{
	NodeLL <Integer> head;
	NodeLL <Integer> tail;
}
