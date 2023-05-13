package com.java8.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamLimitSkipExaample {

	public static void main(String[] args) {

		List<String>fruits=Arrays.asList("Apple","Banana","Mango","Orange","Grapes","PineApple");
		fruits.stream().limit(3).forEach(System.out::println);
		fruits.stream().skip(4).forEach(System.out::println);
	}

}
 