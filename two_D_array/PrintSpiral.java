package two_D_array;

import java.util.Scanner;

public class PrintSpiral {

	public static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);

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

		int dir = 0;
		int top = 0;
		int bottom = row - 1;
		int left = 0;
		int right = col - 1;

		while(top <= bottom && left <= right)
		{
			if(dir == 0) //let to right
			{
				for (int i = left; i <= right; i++) {
					System.out.println(input[top][i]);
				}
				
				top++;
			}
			else if(dir == 1) // top to bottom
			{
				for (int i = top; i <= bottom; i++) {
					System.out.println(input[i][right]);
				}
				
				right--;
			}
			else if(dir == 2)
			{
				for (int i = right; i >= left; i--) {
					System.out.println(input[bottom][i]);
				}
				
				bottom--;
			}
			
			else if(dir == 3)
			{
				for (int i = bottom; i >= top; i--) {
					System.out.println(input[i][left]);
				}
				
				left++;
			}
			
			dir = (dir+1)%4;
		}

	}
}
