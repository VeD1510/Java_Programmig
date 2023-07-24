package com.arrays_09_06_23;

class NegativeException extends Exception {
	public NegativeException() {
		super();
	}

	public NegativeException(String str) {
		super(str);
	}
}

public class Demo {

	public static void main(String[] args) throws NegativeException {
		// TODO Auto-generated method stub
		int a[] = { 4, 45, 6, 10 };

		// 4,6,34,45

		int b[] = new int[a.length];
		int temp;
		int c = a.length / 2;
		boolean isNegative = false;

		for (int i = 0; i < a.length ; i++) {
			if (a[i] < 0) {
				isNegative = true;
				break;
			}
		}
	


		try {
			for (int i = 0; i < a.length / 2; i++) {
				

				temp = a[i];
				a[i] = a[c];
				a[c] = temp;
				c++;
				
				if (isNegative == true) {
					throw new NegativeException("Contain -ve Element");
				}
			}
		} catch (NegativeException e) {
			System.out.println(e);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
