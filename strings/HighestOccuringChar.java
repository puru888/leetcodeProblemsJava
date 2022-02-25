package strings;

public class HighestOccuringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abdefgbabfba";
		
		int max = 0;
		char highChar = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j))
				{
					count++;
				}
			}
			if(max<count)
			{
				max = count;
				highChar = s.charAt(i);
			}
		}
		
		System.out.println(highChar);
		
		

	}

}
