package ObjectAndClass;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator,int denominator)
	{
		this.numerator = numerator;
		if(denominator == 0)
		{
			//TODO Error
		}
		
		this.denominator = denominator;
		simplify();
		
	}
	
	
	private void simplify()
	{
		int gcd = 1;
		int min = Math.min(numerator, denominator);
		
		for (int i = 2; i <= min; i++) {
			if(numerator % i == 0 && denominator % i == 0)
				gcd = i;
		}
		
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public static Fraction add(Fraction f1, Fraction f2)
	{
		int new_numerator = (f1.numerator*f2.denominator)+(f2.numerator*f1.denominator);
		int new_denominator = f1.denominator*f2.denominator;
		
		Fraction f = new Fraction(new_numerator, new_denominator);
		
		return f;
	}
	
	public void add(Fraction f)
	{
		numerator = (numerator * f.denominator)+(f.numerator*denominator);
		denominator *= f.denominator;
		simplify();
	}
	
	public void print()
	{
		if(denominator == 1)
			System.out.println(numerator);
		else
			System.out.println(numerator+"/"+denominator);
	}

}
