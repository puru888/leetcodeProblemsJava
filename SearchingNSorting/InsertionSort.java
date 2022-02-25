package SearchingNSorting;

import java.util.Iterator;

public class InsertionSort {
	
	public static void insertionSort(int input[])
	{
		for (int i = 1; i < input.length; i++) {
			int temp = input[i];
			int j;
			for (j = i - 1; j >=0 && input[j] > temp; j--) {
				input[j+1] = input[j];
			}
			input[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {6,4,3,5,2,1,9};
		insertionSort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

}
