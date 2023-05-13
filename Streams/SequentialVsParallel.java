package com.java8.Streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;
//checking performance sequential vs parallel
public class SequentialVsParallel {

	public static void main(String[] args) {

		System.out.println("Duration using sequential: "+checkPerformance(()->SumUsingSeq(),25));
		System.out.println("Duration using parallel: "+checkPerformance(()->SumUsingParallel(),25));
	}
	static long checkPerformance(Supplier<Integer>sum,int numOfTime) {
		long start=System.currentTimeMillis();
		for(int i=0;i<numOfTime;i++) {
			sum.get();
		}
		long end=System.currentTimeMillis();
		return end-start;
		
	}
    static int SumUsingSeq() {
    	return IntStream.rangeClosed(1, 10000000).sum();
    }
    static int SumUsingParallel() {
    	return IntStream.rangeClosed(1, 10000000).parallel().sum();
    }
}
