package Stack;

import java.util.Iterator;
import java.util.Stack;

public class BalancedParanthesis {

	public static boolean isBalanced(String expression)
	{
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < expression.length(); i++) {
			if(expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[')
			{
				stack.push(expression.charAt(i));
			}
			else if(expression.charAt(i) == ')' || expression.charAt(i) == '}' || expression.charAt(i) == ']')
			{
				if(stack.isEmpty())
					return false;
				
				char topchar = stack.pop();
				
				if (expression.charAt(i) == ')' && topchar == '(' || expression.charAt(i) == '}' && topchar == '{' || expression.charAt(i) == ']' && topchar == '[') {
					continue;
				}
				else
					return false;
			}
		}
		
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalanced("{}()[]"));
	}

}
