package strings;

public class ChkPermutation {
	
	public static int sumOfChar(String s)
	{
		char ch;
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			sum += (int)ch;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcde";
		String t = "baedc";
		
		int ss = sumOfChar(s);
		int tt = sumOfChar(t);
		
		if(ss == tt && s.length() == t.length())
			System.out.println(true);
		else
			System.out.println(false);
	}

}
