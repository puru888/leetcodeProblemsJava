package LinkedList;

import java.util.Scanner;

public class SwapTowNodeLL {

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

	public static Node<Integer> swap(Node<Integer> head,int i,int j)
	{
		if(i == j)
			return head;
		
		Node<Integer> current = head, previous = null;
		Node<Integer>fNode = null,sNode = null, fPrevious = null,sPrevious = null;
		
		int pos = 0;
		
		while(current != null)
		{
			if(pos == i)
			{
				fNode = current;
				fPrevious = previous;
			}
			else if (pos == j)
			{
				sNode = current;
				sPrevious = previous;
			}
			
			previous = current;
			current = current.next;
			pos++;
		}
		
		if(fPrevious != null)
			fPrevious.next = sNode;
		else
			head = sNode;
		
		if(sPrevious != null)
			sPrevious.next = fNode;
		else
			head = fNode;
		
		Node<Integer> currentFNode = sNode.next;
		sNode.next = fNode.next;
		fNode.next = currentFNode;
		
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = swap(head, 2, 4);
		print(head);
	}

}
