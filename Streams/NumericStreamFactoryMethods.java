package com.java8.Streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamFactoryMethods {

	public static void main(String[] args) {

		IntStream i1=IntStream.range(1, 6);
		IntStream i2=IntStream.rangeClosed(1, 6);
		i1.forEach(System.out::println);
		System.out.println("***********************");
		i2.forEach(System.out::println);
		
		LongStream.rangeClosed(1, 50).forEach(System.out::println);
		DoubleStream ds=LongStream.rangeClosed(50, 100).asDoubleStream();
		ds.forEach(System.out::println);
	}

}
