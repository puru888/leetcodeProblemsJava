package Recursion_Assignments;

public class ReplacePi {

	public static String replace(String s) {
		if (s.length() == 0 || s.length() == 1)
			return s;

		if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			String smallInput = replace(s.substring(2));
			return "3.14" + smallInput;
		} else {
			String smallInput = replace(s.substring(1));
			return s.charAt(0) + smallInput;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pipi";
		System.out.println(replace(s));
	}

}
