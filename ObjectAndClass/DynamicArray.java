package ObjectAndClass;

import java.util.Iterator;

public class DynamicArray {

	private int data[];
	private int nextIndex;

	public DynamicArray() {
		data = new int[5];
		nextIndex = 0;
	}

	public int size() {
		return nextIndex;
	}

	public void add(int element) {
		if (nextIndex == data.length) {
			restructure();
		}
		data[nextIndex] = element;
		nextIndex++;
	}

	public int removeLast() {
		int value = data[nextIndex - 1];
		data[nextIndex - 1] = 0;
		nextIndex--;
		return value;
	}

	public void set(int index, int element) {
		if (index > nextIndex)
			return;
		if (index < nextIndex)
			data[index] = element;
		else
			add(element);
	}
	
	public int[] get()
	{
		return data;
	}

	public void print() {
		for (int i = 0; i < nextIndex; i++) {
			System.out.println(data[i]);
		}
	}

	private void restructure() {
		int temp[] = data;
		data = new int[data.length * 2];

		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}

}
