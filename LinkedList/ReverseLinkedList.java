package LinkedList;

import java.util.Scanner;

public class ReverseLinkedList {

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
		{
			System.out.println();
			return;
		}
		
		System.out.print(head.data+" ");
		print(head.next);
	}

	public static Node<Integer> reverseRec(Node<Integer> head)
	{
		if(head == null || head.next == null)
			return head;
		
		Node<Integer> finalHead = reverseRec(head.next);
		Node<Integer> temp = finalHead;
		
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		
		return finalHead;
				
	}
	
	public static NodeDouble revBetter(Node<Integer> head)
	{
		if(head == null || head.next == null)
		{
			NodeDouble ans = new NodeDouble();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		NodeDouble smallAns = revBetter(head.next);
		smallAns.tail.next = head;
		head.next = null;
		
		NodeDouble ans = new NodeDouble();
		ans.head = smallAns.head;
		ans.tail = head; 
		
		return ans;
	}

	public static Node<Integer> revBest(Node<Integer> head)
	{
		if(head == null || head.next == null)
			return head;
		
		Node<Integer> tail = head.next;
		
		Node<Integer> smallHead = revBest(head.next);
		tail.next = head;
		head.next = null;
		
		return smallHead;
		
	}

	public static Node<Integer> revItr(Node<Integer> head)
	{
		Node<Integer> previous = null;
		Node<Integer> current = head;
		Node<Integer> temp;
		
		while(current != null)
		{
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		return previous;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = takeInput();
		//head = reverseRec(head);
		//NodeDouble nd = revBetter(head);
		 //head = revBest(head);
		head = revItr(head);
		 print(head);
	}

}
