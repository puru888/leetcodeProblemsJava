package Recursion;

public class IsArrSorted {

	public static boolean isSorted(int input[]) {
		if (input.length <= 1) {
			return true;
		}

		int smallInput[] = new int[input.length - 1];

		for (int i = 1; i < input.length; i++) {
			smallInput[i - 1] = input[i];
		}

		boolean isSorted = isSorted(smallInput);

		if (!isSorted)
			return false;

		if (input[0] <= input[1])
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 2, 1, 3, 4 };
		System.out.println(isSorted(input));
	}

}
