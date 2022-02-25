package WhileLoopExercise;

import java.util.Scanner;

public class SumOfProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number.");
		int number = sc.nextInt();
		
		System.out.println("Enter choice::\n1:Sum\n2:Product");
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			int sum = 0;
			while(number > 0)
			{
				sum = sum + number;
				number--;
			}
			System.out.println("Sum is::"+sum);
		}
		else if(choice == 2)
		{
			int product = 1;
			while(number > 0)
			{
				product = product*number;
				number--;
			}
			
			System.out.println("Product is::"+product);
		}
		else {
			System.out.println("-1");
		}
	}

}
