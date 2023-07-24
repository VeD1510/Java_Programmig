package com.assignment_opps_30_05_23;

public class AccessModifiers {
	


	private int num1 = 30;

	int num2 = 10;
	protected int z = 300;
	public int ans = 45;

	private void doPrivate() {
		System.out.println("This is private data");
	}

	public static void main(String[] args) {
		AccessModifiers m = new AccessModifiers();
		System.out.println(m.num1);
		m.doPrivate();
		System.out.println(m.num2);
		System.out.println(m.z);
		System.out.println(m.ans);

	}



}
