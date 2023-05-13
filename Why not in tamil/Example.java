package com.java8;

public class Example {

	public static void main(String[] args) {

		int a = 5;
		int b ;
		b = ++a + ++a + a++ + --a + a-- + ++a + a-- ;
		System.out.println(b);
	}

}
