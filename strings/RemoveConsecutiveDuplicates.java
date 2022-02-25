package strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			if(i == input.length()-1)
			{
				if(input.charAt(i-1) == input.charAt(i))
					System.out.println(input.charAt(i));
				else
					System.out.println(input.charAt(i));
			}
			else if(input.charAt(i) != input.charAt(i+1))
			{
				System.out.print(input.charAt(i));
			}
		}
		
	}

}
