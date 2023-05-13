package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

//2.BiConsumer Functional Interface
public class BiConsumerExample {

	public static void main(String[] args) {

		BiConsumer<Integer,Integer>biConsumer=(a,b)->System.out.println("Addition is:"+(a+b));
		biConsumer.accept(10, 20);
		
		List<Integer>list1=Arrays.asList(1,2,3,4);
		List<Integer>list2=Arrays.asList(5,4,3,0);
		
		BiConsumer<List<Integer>,List<Integer>>sizeCheck=(l1,l2)->{
			if(l1.size()==l2.size()) {
				System.out.println("Size is equavalent");
			}else
			{
				System.out.println("Size is not equavalent");
			}
		};
		sizeCheck.accept(list1, list2);
		
		
	}

}
