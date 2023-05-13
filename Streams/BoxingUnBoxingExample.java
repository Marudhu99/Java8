package com.java8.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {

		boxingMethod().forEach(System.out::print);
		System.out.println(" "+calculateSum(boxingMethod()));
	}
	static List<Integer>boxingMethod(){
		return IntStream.rangeClosed(1, 20)//Range primitive data
				        .boxed()//stream of wrapper Integer
				        .collect(Collectors.toList());
	}
    static int calculateSum(List<Integer>list) {
    	return list.stream()//Stream<Integer>
    			.mapToInt(Integer::intValue)//IntStream
    		    .sum();
    }
}
