package Recursion;

public class NFactorial {
	
	public static int factorial(int n)
	{
//		int ans = 1;
//		for (int i = 1; i <= n; i++) {
//			ans *= i;
//		}
//		return ans;
		if(n == 0)
		{
			return 1;
		}
		
		int i = factorial(n-1);
		
		return n * i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = factorial(3);
		System.out.println(n);
	}

}
