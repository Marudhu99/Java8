package com.java8.Streams;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SquentialParallelStreamExample {

	public static void main(String[] args) {

		System.out.println("Available Cores:" + Runtime.getRuntime().availableProcessors());
		String[] num = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		System.out.println("Sequential Run");
		printStream(Arrays.stream(num));
		System.out.println("Parallel run");
		printStream(Arrays.stream(num).parallel());
	}

	static void printStream(Stream<String> stream) {
		stream.forEach(s -> {
			System.out.println(LocalTime.now() + "Value is:" + s + " "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
