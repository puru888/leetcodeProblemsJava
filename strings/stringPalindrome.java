package strings;

public class stringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		boolean b = false;
		
		for (int i = 0; i < s.length(); i++) 
			for (int j = s.length()-i-1; j >= 0; j--) 
				if(i != j)
					if(s.charAt(i) == s.charAt(j))
						b = true;
					else
						b = false;
						
			System.out.println(b);
	}

}
