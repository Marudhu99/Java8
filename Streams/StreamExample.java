package com.java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//SimpleStreams
public class StreamExample {

	public static void main(String[] args) {

		Stream<Integer>s1=Stream.of(1,2,3,4,5,6);
		s1.forEach(num->System.out.println(num));
		
		Integer[] numbers=new Integer[] {1,2,3,4,5,6,7};
		Stream<Integer>s2=Stream.of(numbers);
		s2.forEach(number->System.out.println(number));
		
//		Map<String,List<Person>>map=PersonRepository.getAllPerson().stream().filter(per->per.getHeight>=140)
//		                                                           .collect(Collectors(Person::getName,Person::getHobbies));
//		System.out.println("Person map:"+map);
		
		List<String>fruits=Arrays.asList("Apple","Orange","Banana","PineApple");
		List<Integer>intList=fruits.stream().map(String::length).collect(Collectors.toList());
		System.out.println("Length list:"+intList);
		
		
	}

}
