package com.java8;

import java.util.Comparator;

public class ComparatorLamdaExample {

	public static void main(String[] args) {
		// Before java 8
		Comparator<Integer> c1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				return x.compareTo(y);
			}

		};
		System.out.println("Before java8:" + c1.compare(20, 10));

		// In java8
		Comparator<Integer> c2 = (a, b) -> a.compareTo(b);
		System.out.println("After java8:" + c2.compare(20, 10));
	}

}
