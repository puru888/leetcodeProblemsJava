package forloop;

import java.util.Scanner;

public class N_Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fib = 0;
		for(int i = 1; i <= n; i++)
		{
			if(i == 1)
			{
				fib = 1;
				System.out.println(fib);
			}
			else 
			{
				fib = (i-1)+(i-2);
				System.out.println(fib);
			}
		}
		System.out.println(fib);
	}

}
