package Recursion;

public class NumberOfDigits {

	public static int numOfDigits(int num) {
		num = num / 10;
		if (num == 0)
			return 1;

		int count = numOfDigits(num);

		return count + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = numOfDigits(1234);
		System.out.println(count);
	}

}
