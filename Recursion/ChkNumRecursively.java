package Recursion;

import java.util.Scanner;

public class ChkNumRecursively {

	private static boolean check(int input[], int x, int startIndex) {

		if (startIndex >= input.length)
			return false;

		if (x == input[startIndex])
			return true;

		boolean check = check(input, x, startIndex + 1);

		return check;
	}

	public static boolean check(int input[], int x) {
		return check(input, x, 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(check(input, x));
	}

}
