package Stack;

import java.util.Iterator;

public class stackUsingArr {

	private int data[];
	private int top;

	public stackUsingArr() {
		data = new int[10];
		top = -1;
	}

	public stackUsingArr(int capacity) {
		data = new int[capacity];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return top + 1;
	}

	public int top() throws StackEmptyException {
		if (size() == -1) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}

		return data[top];
	}

	public void push(int elem){
		if (size() == data.length) {
			doubleCapacity();
		}
		top++;
		data[top] = elem;
	}
	
	public int pop() throws StackEmptyException{
		if(size() == 0)
		{
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		
		int temp = data[top];
		top--;
		return temp;
	}

	public void doubleCapacity()
	{
		int temp[] = data;
		data = new int[temp.length*2];
		for (int i = 0; i <= top; i++) {
			data[i] = temp[i];
		}
	}





}
