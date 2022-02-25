package Backtracking;

public class nQueenProblem {

	public static void placeNQueens(int n) {
		int board[][] = new int[n][n];
		placeQueens(board, n, 0);
	}

	public static void placeQueens(int board[][], int n, int row) {
		if (row == n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		for (int col = 0; col < n; col++) {
			if (isSafe(board, row, col)) {
				board[row][col] = 1;
				placeQueens(board, n, row + 1);
				board[row][col] = 0;
			}
		}

	}

	private static boolean isSafe(int[][] board, int row, int col) {
		// TODO Auto-generated method stub
		int n = board.length;

		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) //upper left diagonal
			if (board[i][j] == 1)
				return false;

		for (int i = row + 1, j = col + 1; i < n && j < n; i++, j++) // bottom right diagonal
			if (board[i][j] == 1)
				return false;

		for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) //upper right
			if (board[i][j] == 1)
				return false;

		for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--)//bottom left
			if (board[i][j] == 1)
				return false;

		for (int i = row - 1; i >= 0; i--)
			if (board[i][col] == 1)
				return false;

		for (int i = row + 1; i < n; i++)
			if (board[i][col] == 1)
				return false;

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		placeNQueens(n);
	}

}
