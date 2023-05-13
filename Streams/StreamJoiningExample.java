package com.java8.Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoiningExample {

	public static void main(String[] args) {

		char[]character= {'a','b','c','d'};
		String join=Stream.of(character).map(arr->new String(arr)).collect(Collectors.joining());
		System.out.println("Joined String:"+join);
	}

}
