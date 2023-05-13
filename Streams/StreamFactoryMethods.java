package com.java8.Streams;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamFactoryMethods {
	static UnaryOperator<Integer> uo1 = num -> num + 5;
	static Supplier<Double>supp1=Math::random;//()->Matt.random

	public static void main(String[] args) {
        //Stream.iterate() -ordered and infinitive without limit method
		Stream<Integer> s1 = Stream.iterate(3, uo1).limit(26);
		s1.forEach(System.out::println);
		//Stream.generate() -unorderd and infinitive
		Stream<Double>s2=Stream.generate(supp1).limit(5);
		s2.forEach(System.out::println);
		//Stream.of()
		Stream<String>s3=Stream.of("Mango","Banana","Grapes","Apple");
		s3.forEach(System.out::println);
		
		
		

	}

}
