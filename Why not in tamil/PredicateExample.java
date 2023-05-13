package com.java8;

import java.util.function.Predicate;

//3.Predicate Functional Interface
public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> greaterThan = a -> a > 40;
		Predicate<Integer> lessThan = b -> b < 40;

		System.out.println("GreaterThan:" + greaterThan.test(20));
		System.out.println("LessThan:" + lessThan.test(20));
		System.out.println(greaterThan.and(lessThan).test(30));
		System.out.println(greaterThan.or(lessThan).test(30));
	}

}
