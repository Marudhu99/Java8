package com.java8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	static Comparator<Integer>comp=(a,b)->a.compareTo(b);
	public static void main(String[] args) {
		BinaryOperator<Integer>binary=BinaryOperator.maxBy(comp);
		BinaryOperator<Integer>binary1=BinaryOperator.minBy(comp);
		System.out.println(binary.apply(40, 46));
		System.out.println(binary1.apply(12, 4));

	}
}