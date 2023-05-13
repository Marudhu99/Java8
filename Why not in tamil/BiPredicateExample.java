package com.java8;

import java.util.function.BiPredicate;

//4.BiPredicate Functional Interface
public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer>biPredicate=(a,b)->a>b && b>a;
		System.out.println(biPredicate.test(10, 20));
	}

}
