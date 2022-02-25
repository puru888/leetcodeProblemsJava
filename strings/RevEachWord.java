package strings;

import java.util.Scanner;

public class RevEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		for (int i = input.length()-1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
	}

}
