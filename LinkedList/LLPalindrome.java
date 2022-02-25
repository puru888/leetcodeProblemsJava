package LinkedList;

import java.util.Scanner;

public class LLPalindrome {

	public static doubleNode takeInput()
	{
		doubleNode dn = new doubleNode();
		dn.head= null;
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
		
		return dn;
	}

	public static boolean checkPalindrome(NodeLL<Integer> head,NodeLL<Integer> tail)
	{
		if(head == tail)
			return true;
		
		if(head.data == tail.data)
			return checkPalindrome(head.next, tail.previous);
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleNode dn = takeInput();
		System.out.println(checkPalindrome(dn.head, dn.tail));
	}

}


