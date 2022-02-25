package Recursion;

public class AllIndex {

	private static void printIndex(int input[],int x,int startIndex)
	{
		if(startIndex >= input.length)
			return;
		
		if(x == input[startIndex])
			System.out.print(startIndex+" ");
		
		printIndex(input, x, startIndex+1);
	}
	
	public static void printIndex(int input[],int x)
	{
		printIndex(input, x, 0);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {8,9,8,10,8};
		int x = 8;
		printIndex(input, x);
	}

}
