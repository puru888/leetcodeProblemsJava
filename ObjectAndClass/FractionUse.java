package ObjectAndClass;

public class FractionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction f1 = new Fraction(10,20);
		f1.print();
		
		Fraction f2 = new Fraction(30, 40);
	
//		f1.add(f2);
//		f1.print();
		
		Fraction f3 = Fraction.add(f1, f2);
		f3.print();
	}

}
