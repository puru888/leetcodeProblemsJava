package Recursion;

public class Pattern {
	
	public static void draw(int n,int i)
	{
		System.out.print("*");
		if(i < n)
		{
			int j = 1;
			if(j <= i)
				draw(n, j+1);
			draw(n, i+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		draw(5, 1);
	}

}
