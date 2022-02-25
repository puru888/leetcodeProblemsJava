package SearchingNSorting;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int arr[],int elem)
	{
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end)
		{
			int mid = (start+end)/2;
			if(elem == arr[mid])
			{
				return mid;
			}
			else if(elem > arr[mid])
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int elem = sc.nextInt();
		int ans = binarySearch(arr, elem);
		System.out.println(ans);
		
		
	}

}
