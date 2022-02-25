package Recursion_Assignments;

public class PairStar {

	public static String printStar(String s)
	{
		if(s.length() <= 1)
			return s;
		
		if(s.charAt(0) == s.charAt(1))
			return s.charAt(0)+"*"+printStar(s.substring(1));
		else
			return s.charAt(0)+printStar(s.substring(1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printStar("aaaa"));
	}

}
