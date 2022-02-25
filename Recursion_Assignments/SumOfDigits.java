package Recursion_Assignments;

public class SumOfDigits {

	public static int sum(int n)
	{
		if(n <= 0)
			return 0;
		
		int rem = n%10;
		
		return rem + sum(n/10);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = sum(12345);
		System.out.println(ans);
	}

}
