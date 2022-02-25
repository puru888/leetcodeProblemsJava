package strings;

public class RevStrWordWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to hello world";
		
		String ss[] = s.split(" ");
		
		for (int i = ss.length - 1; i >=0; i--) {
			System.out.print(ss[i]+" ");
		}
		
	}

}
