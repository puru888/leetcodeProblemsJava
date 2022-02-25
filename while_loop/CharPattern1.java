package while_loop;

public class CharPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i < 5)
		{
			int j = 1; 
			while(j <= i)
			{
				char ch = (char) ('A'+j-1);
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
