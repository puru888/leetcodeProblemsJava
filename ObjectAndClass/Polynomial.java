package ObjectAndClass;

import java.util.Iterator;

public class Polynomial {

	DynamicArray coefficient;

	public Polynomial() {
		coefficient = new DynamicArray();
	}

	public void setCoefficient(int deg, int coeff) {
		coefficient.set(deg, coeff);
	}

	public static Polynomial add(Polynomial p1, Polynomial p2) {
		Polynomial p = new Polynomial();
		
		DynamicArray da1 = p1.coefficient;
		DynamicArray da2 = p2.coefficient;
		
		int size = Math.max(da1.size(), da2.size());
		int data1[] = da1.get();
		int data2[] = da2.get();
		
		for (int i = 0; i < size; i++) {
			p.setCoefficient(i, data1[i]+data2[i]);
		}
		
		return p;
	}

	public void print() {
		int coeff[] = coefficient.get();
		int size = coefficient.size();
	
		for (int i = 0; i < size; i++) {
		System.out.print(coeff[i]+"x"+i+" ");
		}
		
		System.out.println();
	}
}
