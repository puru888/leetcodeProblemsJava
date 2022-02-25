package two_D_array;

import java.util.Scanner;

public class PrintLikeWave {
	
	public static int[][] takeInput()
	{
		Scanner sc = new Scanner( System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int input[][] = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				input[i][j] = sc.nextInt();
			}
		}
		
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[][] = takeInput();
		
		int row = input.length;
		int col = input[0].length;
		
		for (int j = 0; j < col; j++) {
			if((j+1)% 2 == 0)
			{
				for (int i = row - 1; i >=0; i--) 
				{
					System.out.print(input[i][j]+" ");
				}
			}
			else
			{
				for (int i = 0; i < row; i++) {
					System.out.print(input[i][j]+" ");
				}
			}
		}
		
	}

}
