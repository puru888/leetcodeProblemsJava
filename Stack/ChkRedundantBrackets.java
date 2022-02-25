package Stack;

import java.util.Stack;

public class ChkRedundantBrackets {

	private static boolean find(char ch)
	{
		if(ch == '+' || ch=='-' || ch=='*' || ch=='/')
			return true;
		else
			return false;
	}
	
	public static boolean check(String s) {
		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(' || find(s.charAt(i)))
				stk.push(s.charAt(i));
			else if(s.charAt(i)==')')
			{
				boolean hasOperator = false;
				
				while (!stk.isEmpty() && stk.peek() != '(') {
					stk.pop();
					hasOperator = true;
				}
				
				if(!hasOperator)
					return true;
				
				if(!stk.isEmpty())
					stk.pop();
			}
		}
		return false;
	}

	public static boolean check1(String s) {
		
		Stack<Character> stk = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ')')
				stk.push(s.charAt(i));
			else {
				if(stk.peek() == '(')
					return true;
				
				while(stk.peek() != '(')
					stk.pop();
				
				stk.pop();
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("a+(b)+c"));
	}

}
