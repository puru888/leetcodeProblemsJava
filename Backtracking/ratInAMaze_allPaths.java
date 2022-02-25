package Backtracking;

public class ratInAMaze_allPaths {

	public static void ratInMaze(int maze[][]) {
		int n = maze.length;
		int path[][] = new int[n][n];
		allPaths(maze, 0, 0, path);

	}

	public static void allPaths(int maze[][], int i, int j, int path[][]) {

		int n = maze.length;

		if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1)
			return;

		path[i][j] = 1;

		if (i == n - 1 && j == n - 1) {
			for (int row = 0; row < n; row++) {
				for (int col = 0; col < n; col++) {
					System.out.print(path[row][col] + " ");
				}
				System.out.println();
			}
			System.out.println();
			path[i][j] = 0;
			return;
		}

		allPaths(maze, i - 1, j, path);
		allPaths(maze, i, j + 1, path);
		allPaths(maze, i + 1, j, path);
		allPaths(maze, i, j - 1, path);
		path[i][j] = 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
		ratInMaze(maze);
	}

}
