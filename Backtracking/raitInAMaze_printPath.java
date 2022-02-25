package Backtracking;

public class raitInAMaze_printPath {

	public static boolean ratInMaze(int maze[][]) {
		int n = maze.length;
		int path[][] = new int[n][n];
		return solveMaze(maze, 0, 0, path);
				
	}
	
	public static boolean solveMaze(int maze[][],int i,int j,int path[][]) {
		int n = maze.length;
		if(i < 0 || i >= n || j < 0 || j >=n || maze[i][j] == 0 || path[i][j] == 1)
			return false;
		
		path[i][j] = 1;
		if(i == n - 1 && j == n - 1) {
			for (int row = 0; row < n; row++) {
				for (int col = 0; col < n; col++) {
					System.out.print(path[row][col]+" ");
				}
				System.out.println();
			}
			return true;
		}
		
		if(solveMaze(maze, i-1, j, path))
			return true;
		if(solveMaze(maze, i, j+1, path))
			return true;
		if(solveMaze(maze, i+1, j, path))
			return true;
		if(solveMaze(maze, i, j-1, path))
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int maze[][] = {{1,1,0},{1,0,1},{0,0,1}};
		int maze[][] = {{1,1,0},{1,1,0},{1,1,1}};
		boolean pathPossible = ratInMaze(maze);
		System.out.println(pathPossible);
	}

}
