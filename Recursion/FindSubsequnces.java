package Recursion;

public class FindSubsequnces {

	public static String[] findSubsequnce(String s)
	{
		if(s.length() == 0)
		{
			String ans[] = {""};
			return ans;
		}
		
		String smallAns[] = findSubsequnce(s.substring(1));
		String ans [] = new String[smallAns.length*2];
		
		for (int i = 0; i < smallAns.length; i++) {
			ans[i] = smallAns[i];
		}
		
		for (int i = 0; i < smallAns.length; i++) {
			ans[i+smallAns.length] = s.charAt(0) + smallAns[i];
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "xyz";
		String arr[] = findSubsequnce(s);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
