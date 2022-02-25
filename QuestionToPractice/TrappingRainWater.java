package QuestionToPractice;

public class TrappingRainWater {

	public static int totalWater(int input[])
	{
		int n = input.length;
		int left[] = new int[n];
		int right[] = new int[n];
		int max = left[0] = input[0];
		int min = right[n-1] = input[n-1];
		
		for (int i = 1; i < n; i++) {
			if(input[i] > max) max = input[i];
			left[i] = max;
		}
		
		for (int i = n-2; i >= 0; i--) {
			if(input[i] > min) min = input[i];
			right[i] = min;
		}
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Math.min(left[i], right[i])-input[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {3,0,0,2,0,4};
		System.out.println(totalWater(input));
	}

}
