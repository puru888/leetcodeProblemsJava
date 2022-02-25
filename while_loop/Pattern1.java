package while_loop;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		while(i<6)
		{
			int j = 1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
