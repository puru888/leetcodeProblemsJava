package function;

import java.util.Scanner;

public class NCR {
	
	public static int factorial(int n)
	{
		int ans = 1;
		for(int i = 1; i <= n; i++)
		{
			ans *= i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int num = factorial(n);
		int den1 = factorial(r);
		int den2 = factorial(n-r);
		
//		int num = 1;
//		for(int i = 1; i <= n; i++)
//		{
//			num *= i;
//		}
//		
//		int den1 = 1;
//		for(int i = 1; i <= r; i++)
//		{
//			den1 *= i;
//		}
//		
//		int den2 = 1;
//		for(int i = 1; i <= n-r; i++)
//		{
//			den2 *= i;
//		}
		
		int ans = num/(den1 * den2);
		System.out.println(ans);
	}

}
