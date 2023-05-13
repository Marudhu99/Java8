package com.java8.Streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamMethod {

	public static void main(String[] args) {

		int sum=IntStream.rangeClosed(1, 50).sum();
		System.out.println("Total is:"+sum);
		
		OptionalInt max=IntStream.rangeClosed(1, 50).max();
		System.out.println("Max value is:"+max.getAsInt());
		
		OptionalInt min=IntStream.rangeClosed(1, 50).min();
		System.out.println("Max value is:"+min.getAsInt());
		
		OptionalDouble average=IntStream.rangeClosed(1, 50).average();
		System.out.println("Average is:"+average.getAsDouble());
		
	}

}
