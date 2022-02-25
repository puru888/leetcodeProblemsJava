package Recursion;

import java.util.Scanner;

public class LastIndex {

	private static int lastIndex(int input[],int x,int startIndex)
	{
		if(startIndex < 0)
			return -1;
		
		if(x == input[startIndex])
			return startIndex;
		
		int ans = lastIndex(input, x, startIndex-1);
		
		return ans;
	}
	
	public static int lastIndex(int input[],int x)
	{
		return lastIndex(input, x, input.length-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int input[] = new int[size];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		
		int ans = lastIndex(input, x);
		System.out.println(ans);
	}

}
