package Stack;

import java.util.Stack;

public class MinimumBracketReversal {

	public static int count(String s)
	{
		Stack<Character> stk = new Stack<>();
		
		if(s.length() % 2 != 0)
			return -1;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '{')
				stk.push(s.charAt(i));
			else if(s.charAt(i) == '}' && stk.peek() == '{')
				stk.pop();
		}
		int count = 0;
		while (!stk.isEmpty()) {
			stk.pop();
			count++;
		}
		
		return count/2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("{{}}{{{{"));
	}

}
