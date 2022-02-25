package SearchingNSorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void swap(int input[],int i, int j)
	{
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	
	public static void bubbleSort(int input[])
	{
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i] > input[j])
				{
					swap(input, i, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		bubbleSort(input);
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

}
