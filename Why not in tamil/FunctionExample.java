package com.java8;

import java.util.function.Function;

//5.Function Functional Interface
public class FunctionExample {
    //note:first argument->input,second argument->output
	static Function<String, Integer>f1=s->s.length();
	static Function<String,String>f2=s->s.toLowerCase();
	static Function<String, String>f3=s->s.toUpperCase().concat(" features");
	
	public static void main(String[] args) {

		int length=f1.apply("MarudhuPandiyan");
		System.out.println("Length:"+length);
		
		System.out.println("LowerCase:"+f2.apply("ArulPandiyan"));
		System.out.println("UpperCase:"+f3.apply("java"));
		//AndThen method
		System.out.println("AndThen:"+f2.andThen(f3).apply("Java8"));
		//compose method
		System.out.println("compose:"+f2.compose(f3).apply("Java8"));
		//identity method same i/o
		Function<String,String>identity=Function.identity();
		System.out.println(identity.apply("Monster"));
	}

}
