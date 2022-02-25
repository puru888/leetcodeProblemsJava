package while_loop;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int val = 1;
		while(i<5)
		{
			int j = 1;
			while(j<=i)
			{
				System.out.print(val);
				val++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
