package com.java8;

import java.util.function.Consumer;

//1.Consumer Functional Interface
public class ConsumerExample {
	
	public static void main(String[] args) {

		Consumer<String> c1 = (a) -> System.out.println("Uppercase is:" + a.toUpperCase());
		c1.accept("Java");
		Consumer<String> c2 = (a) -> System.out.println("LowerCase is:" + a.toLowerCase());
		c2.accept("JAVA");
		Consumer<Integer> c3 = (x) -> System.out.println("Addition:" + (x + 100));
		Consumer<Integer> c4 = (x) -> System.out.println("Substraction:" + (x - 10));
		// Using andThen() default method in consumer interface
		c1.andThen(c2).accept("Java8 Feautures");
		c3.andThen(c4).accept(50);

	}
}