package Recursion_Assignments;

import java.util.Scanner;

public class Multiplication {
	
	public static int mul(int m, int n)
	{
		if(n <= 0)
			return 0;
		
		return mul(n-1,m)+m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int ans = mul(m, n);
		System.out.println(ans);
	}

}
