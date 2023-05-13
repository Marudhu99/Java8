package com.java8;

import java.util.function.BiFunction;

//6.BiFunction Functional Interface
public class BiFunctionExample {

	public static void main(String[] args) {

		BiFunction<String,String,String> biFunction=(a,b)->a.concat(b);
		System.out.println(biFunction.apply("Marudhu", " Pandiyan"));
	}

}
