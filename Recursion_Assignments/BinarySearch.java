package Recursion_Assignments;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int elem,int start,int end)
	{
		if(start >= end)
			return 0;
		
		int mid = (start+end)/2;
		
		if(elem == arr[mid])
			return mid;
		else if(elem > arr[mid])
			return binarySearch(arr, elem, mid, end);
		else
			return binarySearch(arr, elem, start, mid);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4, 5, 6, 8, };
		int ans = binarySearch(arr, 5, 0, arr.length-1);
		System.out.println(ans);
	}

}
