package ObjectAndClass;

public class PolynomialUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polynomial p1 = new Polynomial();

		p1.setCoefficient(0, 2);
		p1.setCoefficient(1, 3);
		p1.setCoefficient(2, 6);
		p1.print();

		Polynomial p2 = new Polynomial();
		p2.setCoefficient(0, 4);
		p2.setCoefficient(1, 2);
		 p2.print();

		Polynomial p = Polynomial.add(p1, p2);
		p.print();

	}

}
