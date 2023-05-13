package com.java8;

import java.util.stream.IntStream;

public class Java7VsJava8 {

	public static void main(String[] args) {

		int total=0;
		for(int i=1;i<=50;i++) {
			total+=i;
		}
		System.out.println("Before java8:"+total);
		int total1=IntStream.rangeClosed(1, 50).sum();
		System.out.println("After java8:"+total1);
	}

}
