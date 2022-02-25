package Recursion_Assignments;

public class CountZeroes {

	public static int count(int n)
	{
		if(n == 0)
			return 0;
		
		if(n%10==0)
		{
			return 1 + count(n/10);
		}
		
		
		return count(n/10);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 708000;
		int ans = count(i);
		System.out.println(ans);
	}

}
