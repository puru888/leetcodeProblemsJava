package ObjectAndClass;

public class ComplexNumber {
	private int real;
	private int imaginary;

	public ComplexNumber(int real, int imaginary) {

		this.real = real;
		this.imaginary = imaginary;

	}

	public static ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2) {
		int newReal = cn1.real + cn2.real;
		int newImaginary = cn1.imaginary + cn2.imaginary;
		ComplexNumber cn = new ComplexNumber(newReal, newImaginary);
		return cn;
	}
	
	public void add(ComplexNumber cn) {
		real += cn.real;
		imaginary += cn.imaginary;
	}

	public void multiply(ComplexNumber cn) {
		int treal = (real * cn.real) - (imaginary * cn.imaginary);
		int timaginary = (real * cn.imaginary) + (cn.real * imaginary);

		real = treal;
		imaginary = timaginary;
	}

	public void print() {
		System.out.println(real + " " + "+" + " " + "i" + imaginary);
	}
	
	public ComplexNumber()
	{
		
	}
}
