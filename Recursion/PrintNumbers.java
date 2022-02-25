package Recursion;

public class PrintNumbers {
	
	public static void printNum(int num)
	{
		if(num == 0)
		{
			return;
		}
		printNum(num-1);
		System.out.print(num+" ");;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum(6);
	}

}
