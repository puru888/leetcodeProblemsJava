package WhileLoopExercise;

import java.util.Iterator;
import java.util.Scanner;

public class TermsOfAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range:");
		int range = sc.nextInt();
		
//		int count = 0;
//		for (int i = 1; i <= range + count; i++) {
//			int term = (3*i)+2;
//			if(term%4 == 0)
//			{
//				count++;
//			}
//			else
//			{
//				System.out.println(term);
//			}
//		}
		
		int count = 0;
		int i = 1;
		while(i <= range+count)
		{
			int term = (3*i)+2;
			if(term % 4 == 0)
			{
				count++;
			}
			else
			{
				System.out.println(term);
			}
			i++;
		}

			
	}

}
