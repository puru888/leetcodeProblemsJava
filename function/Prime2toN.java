package function;

import java.util.Scanner;

public class Prime2toN {
	
	public static boolean isPrime(int n )
	{
		for(int i = 2; i<n; i++)
			if(n%i == 0)
				return false;
		
		return true;
	}
	
	public static void prime(int n)
	{
		for(int i = 2; i <=n; i++)
		{
			boolean isPrime = true;
			
			for(int j = 2; j < i; j++)
			{
				if(i%j == 0)
				{
					isPrime = false;
				}
			}
			
			if(isPrime)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		prime(n);

	}

}
