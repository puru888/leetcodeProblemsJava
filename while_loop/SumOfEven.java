package while_loop;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= n)
		{
			if(i%2 == 0)
			{
				sum = sum+i;
			}
			i++;
		}
		
		System.out.println(sum);

	}

}
