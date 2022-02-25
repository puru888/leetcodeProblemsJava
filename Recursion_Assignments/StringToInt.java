package Recursion_Assignments;

public class StringToInt {

	public static int strToInt(String s,int length)
	{
		if(s.length() == 0)
			return 0;
		
		String c = s.valueOf(s.charAt(s.length()-1));
		int i = Integer.parseInt(c);
		
		if(s.length() == length)
			return i + strToInt(s.substring(0,s.length()-1),length);
		else
			return 10 * (i + strToInt(s.substring(0,s.length()-1),length));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12";
		
		System.out.println(strToInt(s,s.length()));
	}

}
