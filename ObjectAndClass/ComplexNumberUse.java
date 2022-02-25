package ObjectAndClass;

import java.util.Scanner;

public class ComplexNumberUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ComplexNumber cn1 = new ComplexNumber(4, 5);
		ComplexNumber cn2 = new ComplexNumber(6,7);
	
		int choice = sc.nextInt();
		if(choice == 1)
		{
			cn1.add(cn2);
			cn1.print();
		}
		else if(choice == 2)
		{
			cn1.multiply(cn2);
			cn1.print();
		}
		
	}

}
