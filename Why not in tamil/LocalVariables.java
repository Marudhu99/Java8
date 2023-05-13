package com.java8;

import java.util.function.Consumer;

public class LocalVariables {
    static int k=50;//global variable or instance variable
	public static void main(String[] args) {
        int i=5;//local variable
		Consumer<Integer>c1=j->{
			System.out.println("Value i="+i);
			System.out.println("Value j="+j);
			System.out.println("Addition i+j="+(i+j));//lamda expression are allowed to local variable
			//i++;  lamda expression local variable is not modify.Because local variable is relevant final 
			k=60; //modify global variable
			System.out.println("Value k="+k);
		};
		c1.accept(5);
	}

}
