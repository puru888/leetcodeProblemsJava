package while_loop;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int count = 0;
		while (i<5) {
			int k = 4;
			while (k > i) {
				System.out.print(" ");
				k--;
			}
			int j = 1;
			while (j<=i) {
				System.out.print(count);
				count++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
