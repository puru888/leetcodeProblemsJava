package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StockSpan {

	public static int[] stockSpan(int input[])
	{
		Stack<Integer> stack = new Stack<>();
		int n = input.length;
		
		int output[] = new int[n];
		
		stack.push(0);
		output[0] = 1;
		
		for (int i = 1; i < n; i++) {
			while (!stack.isEmpty() && input[stack.peek()] < input[i]) {
				stack.pop();
			}
			if(stack.isEmpty())
				output[i] = i+1;
			else
				output[i] = i - stack.peek();
			
			stack.push(i);
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {60 ,70 ,80 ,100 ,90 ,75 ,80 ,120};
		int ans[] = stockSpan(input);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
