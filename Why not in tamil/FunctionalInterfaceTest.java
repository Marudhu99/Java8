package com.java8;

public class FunctionalInterfaceTest {
	
	
}

@FunctionalInterface
interface Interface1 {
	void run();

	// Advantage of java8 default method and static method
	default void methodOne() {
		System.out.println("Message from java8");

	}

	static void methodTwo() {
		System.out.println("Message from method2");

	}
}