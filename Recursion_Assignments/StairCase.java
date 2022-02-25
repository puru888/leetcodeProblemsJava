package Recursion_Assignments;

public class StairCase {

	public static int possibleWays(int n)
	{
		if(n == 0 || n == 1)
			return 1;
		else if(n == 2)
			return 2;
		else
			return possibleWays(n-3) + possibleWays(n-2) + possibleWays(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int ans = possibleWays(n);
		System.out.println(ans);
	}

}
