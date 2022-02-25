package Recursion_Assignments;

public class GeometricSum {
	
	public static double sum(int n)
	{
		if(n <= 0)
		{
			return 1;
		}
		
		int mul = 1;
		for (int i = 0; i < n; i++) {
			mul *= 2;
		}
		
		double ans = (double)1/(double)mul;
		
		return ans + sum(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ans = sum(4);
		System.out.println(ans);
	}

}
