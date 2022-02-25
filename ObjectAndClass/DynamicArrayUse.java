package ObjectAndClass;

public class DynamicArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DynamicArray da = new DynamicArray();

		for (int i = 0; i < 10; i++) {
			da.add(i + 10);
		}
		// da.print();

		da.set(10, 20);
		da.print();
	}

}
