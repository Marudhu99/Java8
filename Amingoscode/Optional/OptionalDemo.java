package com.Amingoscode.Optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		//isEmpty and isPresent
		Optional<String> name = Optional.of("Marudhu"); // if null , i'm getting response nullpointerexception
		System.out.println(name.isEmpty());
		System.out.println(name.isPresent());

		//ofNullable
		Optional<String> fatherName = Optional.ofNullable("Vadivelu"); // if null value output is Optional.empty
		System.out.println(fatherName);

		//orElse
		String orElse = fatherName
				.map(String::toUpperCase)
				.orElse("Vadivel"); // if fatherName value is null . null into Vadivel
		System.out.println(orElse);

		//orElseGet
		Optional<String> url = Optional.ofNullable(null);
		String orElseGet = url
				.map(String::toLowerCase)
				.orElseGet(()->{
					//... extra computation to retrieve the value
					return "www.google.com";
				});
		System.out.println(orElseGet);
		
		//orElseThrow
		Optional<Integer> age = Optional.ofNullable(23);
		Integer orElseThrow = age.orElseThrow(NullPointerException::new);
		System.out.println(orElseThrow);
		
		//ifPresent
		Optional<String> msg = Optional.ofNullable(null);
		msg.ifPresent(System.out::println);
		
		//ifPresentOrElse
		msg.ifPresentOrElse(System.out::println, ()->System.out.println("Pandiyan"));
		
		System.out.println("************************************************");
		
		Student student = new Student("Ayyappan","Marudhu@gmail.com");
		System.out.println(student.getEmail().map(String::toLowerCase).orElse("Email does not contains"));
	}

}
