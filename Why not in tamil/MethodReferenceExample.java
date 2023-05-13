package com.java8;

import java.util.Comparator;
//MethodReference
//ClassName::StaticMethodName - ()->{}
//obj::Non-static methodName
//ClassName::new -Constructor
public class MethodReferenceExample {

	public static void main(String[] args) {
		
       System.out.println("Before java8:"+MethodReferenceExample.compare1(10, 20));
       
       Comparator<Integer>c1=MethodReferenceExample::compare1;//lamda expression=>  (a,b)->compare(a,b);
       System.out.println("In Java8:"+c1.compare(20,10));
		
	}
	public static int compare1(Integer a, Integer b) {
		return Integer.compare(a, b);
	}

}
