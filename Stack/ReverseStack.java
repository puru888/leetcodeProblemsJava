package Stack;

import java.util.Stack;

public class ReverseStack {

	public static Stack<Integer> reverse(int input[])
	{
		Stack<Integer> s1 = new Stack<>();
		
		for (int i = 0; i < input.length; i++) {
			s1.push(input[i]);
		}
		
		Stack<Integer> s2 = new Stack<>();
		while(!s1.isEmpty())
		{
			int elem = s1.pop();
			s2.push(elem);
		}
		
		return s2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,2,3,4,5};
		Stack<Integer> ans = reverse(input);
		while(!ans.isEmpty())
		{
			System.out.println(ans.peek());
			ans.pop();
		}
	}

}
