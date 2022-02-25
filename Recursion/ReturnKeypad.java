package Recursion;

public class ReturnKeypad {
	
	private static String[] keys(int n)
	{
		switch (n) {
		case 2:
			return new String[] {"a","b","c"};
		case 3:
			return new String[] {"d","e","f"};
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}

	public static String[] returnKeyCombo(int n)
	{
		if(n == 0)
		{
			return new String[] {""};
		}
		
		String keys[] = keys(n%10);
		String smallAns[] = returnKeyCombo(n/10);
		
		String ans[] = new String[keys.length*smallAns.length];
		int k = 0;
		
		for (int i = 0; i < smallAns.length; i++) {
			for (int j = 0; j < keys.length; j++) {
				ans[k] = smallAns[i] + keys[j];
				k++;
			}
		}
	
		return ans;
		
	}
	
	public static void main(String[] args) {
		String ans[] = returnKeyCombo(23);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
