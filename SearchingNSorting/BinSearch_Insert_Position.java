package SearchingNSorting;

import java.util.Scanner;

public class BinSearch_Insert_Position {

	public static int binarySearch(int input[],int element)
	{
		int start = 0;
		int end = input.length-1;
		int mid = 0;
		int ans = -1;
		
		while(start <= end)
		{
			mid = (start+end)/2;
			if(element == input[mid])
			{
				return mid;
			}
			if(element > input[mid])
			{
				start = mid + 1;
				ans = mid + 1;
			}
			if(element < input[mid])
			{
				ans = mid;
				end = mid - 1;
			}
		}
		
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input[] = {1,3};
		int element = sc.nextInt();
		int ans = binarySearch(input, element);
		System.out.println(ans);
		
	}

}
