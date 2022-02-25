package Recursion;

public class SumOfArr {

	public static int sumOfArr(int input[],int i)
	{
		if(i >= input.length)
			return 0;
		
		return sumOfArr(input, i+1)+input[i];
	}
	
	public static int sumOfArr(int input[])
	{
		return sumOfArr(input, 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,2,3};
		
		int ans = sumOfArr(input);
		System.out.println(ans);
		
	}

}
