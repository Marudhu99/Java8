package com.java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStream {

	public static void main(String[] args) {

		List<Integer>oddNumber=Arrays.asList(1,3,5,7,9,11);
		List<Integer>evenNumber=Arrays.asList(2,4,6,8,10);
		
		List<List<Integer>>listOfList=Arrays.asList(oddNumber,evenNumber);
		System.out.println("Before Flatten:"+listOfList);
		List<Integer>flattenList=listOfList.stream()
				                .flatMap(List::stream).collect(Collectors.toList());
		System.out.println("After Flatten:"+flattenList);
		
	}

}
