package Recursion;

import java.util.Scanner;

public class FirstIndex {

	private static int checkFirstIndex(int input[], int x, int startIndex) {
		if (startIndex >= input.length)
			return -1;

		if (x == input[startIndex])
			return startIndex;

		int ans = checkFirstIndex(input, x, startIndex + 1);

		return ans;
	}

	public static int checkFirstIndex(int input[], int x) {
		return checkFirstIndex(input, x, 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int input[] = new int[size];

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}

		int x = sc.nextInt();

		int ans = checkFirstIndex(input, x);
		System.out.println(ans);
	}

}
