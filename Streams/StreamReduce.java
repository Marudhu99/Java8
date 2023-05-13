package com.java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

	public static void main(String[] args) {

		List<Integer>list=Arrays.asList(1,2,3,4,5,6);
		Optional<Integer>sum=list.stream().reduce((a,b)->a+b);
		//1+2=3
		//3+3=6
		//6+4=10
		//10+5=15
		//15+6=21
		System.out.println("Sum is:"+sum.get());
		
		int sum1=list.stream().mapToInt(i->i).sum();
		System.out.println("Sum is:"+sum1 );
	}

}