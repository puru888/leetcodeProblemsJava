package Recursion_Assignments;

public class ReplaceX {

	public static String replaceX(String s)
	{
		if(s.length() == 0)
			return s;
		
		if(s.charAt(0) == 'x')
		{
			return replaceX(s.substring(1));
		}
		else
			return s.charAt(0) + replaceX(s.substring(1)) ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="xabx";
		System.out.println(replaceX(s));
	}

}
