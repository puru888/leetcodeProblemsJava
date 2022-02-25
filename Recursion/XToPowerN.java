package Recursion;

public class XToPowerN {
	
	public static int power(int base,int power)
	{
		if(power == 0)
		{
			return 1;
		}
		
		int ans = power(base,power-1);
		
		return base*ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans =power(2, 5);
		System.out.println(ans);
	}

}
