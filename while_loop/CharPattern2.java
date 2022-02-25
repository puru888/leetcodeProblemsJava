package while_loop;

public class CharPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int count = i;
		while(i < 5)
		{
			int j = 1;
			//int count = i;
			while(j <= i)
			{
				char ch = (char)('A'+count - 1);
				System.out.print(ch);
				count++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
