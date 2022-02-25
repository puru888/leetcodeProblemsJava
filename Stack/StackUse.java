package Stack;

import java.util.Iterator;

public class StackUse {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		stackUsingArr stack = new stackUsingArr();
		
		for (int i = 1; i <= 20; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
