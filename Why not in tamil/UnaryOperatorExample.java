package com.java8;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample{
	static UnaryOperator<String>unary=name->name.toUpperCase();
	public static void main(String[]args) {
			System.out.println(unary.apply("Marudhu"));
	}
}