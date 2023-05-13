package com.java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//allMatch or anyMatch
public class StreamAllOrAnyMatch {
	static Predicate<String>p1=s->s.length()>4;
	static Predicate<String>p2=s->s.length()>7;
	public static void main(String[] args) {

		List<String>fruits=Arrays.asList("Mango","Banana","Grapes","Apple");
		System.out.println("All Match:"+fruits.stream().allMatch(p1));
		System.out.println("Any Match:"+fruits.stream().anyMatch(p2));
	}

}
