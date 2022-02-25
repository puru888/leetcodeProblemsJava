package while_loop;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int i = 1;
		while(i < 5)
		{
			int j = 1;
			int count = i;
			while(j <= i )
			{
				System.out.print(count);
				count++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
