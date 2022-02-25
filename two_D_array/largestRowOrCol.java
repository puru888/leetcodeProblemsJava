package two_D_array;

import java.util.Scanner;

public class largestRowOrCol {

	public static int[][] takeinput()
	{
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
	
	public static void printInput(int input[][])
	{
	}
	
	public static String largeSum(int input[][])
	{
		int row = input.length;
		int col = input[0].length;
		
		int largeRow = 0,largeCol = 0;
		int rowIndex = 0,colIndex = 0;
		
		for (int i = 0; i < col; i++) {
			int colSum = 0;
			for (int j = 0; j < row; j++) {
				colSum += input[j][i];
			}
			if(colSum == largeCol)
			{
				continue;
			}
			else if(colSum > largeCol)
			{
				largeCol = colSum;
				colIndex = i;
			}
		}
		
		for (int i = 0; i < row; i++) {
			int rowSum = 0;
			for (int j = 0; j < col; j++) {
				rowSum += input[i][j];
			}
			if(rowSum == largeRow)
			{
				continue;
			}
			else if(rowSum > largeRow)
			{
				largeRow = rowSum;
				rowIndex = i;
			}
		}
		
		if(largeCol == largeRow)
			return "row "+rowIndex+" "+largeRow;
	
		else if(largeCol > largeRow)
			return "col "+colIndex+" "+largeCol;
		
		else
			return "row "+rowIndex+" "+largeRow;	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[][] = takeinput();
		
		String s = largeSum(input);
		
		System.out.println(s);
	}

}
