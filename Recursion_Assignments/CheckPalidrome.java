package Recursion_Assignments;

public class CheckPalidrome {

	private static boolean checkPalidrome(String s,int startIndex,int endIndex)
	{
		if(startIndex == endIndex)
			return true;
		
		if(s.charAt(startIndex) != s.charAt(endIndex))
			return false;
		
		return checkPalidrome(s, startIndex+1, endIndex-1);
	}
	
	public static boolean checkPalidrome(String s)
	{
		return checkPalidrome(s, 0, s.length()-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ninja";
		String ss = "racecar";
		
		System.out.println(checkPalidrome(s));
		System.out.println(checkPalidrome(ss));
	}

}
