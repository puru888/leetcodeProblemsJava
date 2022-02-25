package while_loop;

public class isoceelseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i < 5)
		{
			int k = 4;
			while(k > i)
			{
				System.out.print(" ");
				k--;
			}
			int j = 1;
			while(j <= i)
			{
				System.out.print(j);
				j++;
			}
			
			j = 1;
			while(j <= i-1)
			{
				System.out.print(j);
				j++;
			}
			
			System.out.println();
			i++;
		}
	}

}
