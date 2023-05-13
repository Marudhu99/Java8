package com.java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class NumericStreamsExample {
    static BinaryOperator<Integer>bo1=(a,b)->a+b;
	public static void main(String[] args) {

		List<Integer>num=Arrays.asList(1,2,3,4,5);
		System.out.println("Using Stream:"+calculateSumUsingStream(num));
		IntStream i1=IntStream.rangeClosed(1, 5);
		System.out.println("Using IntStream:"+calcualteSumUsingIntStream(i1));
	}
	static int calculateSumUsingStream(List<Integer>list) {
		return list.stream().reduce(0,bo1);
	}
    static int calcualteSumUsingIntStream(IntStream i) {
    	return i.sum();
    }
}
