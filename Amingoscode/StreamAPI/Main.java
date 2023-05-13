package com.Amingoscode.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Person> people = getAllPerson();

		//Imperative approach
		List<Person> females = new ArrayList<>();
		for(Person person:people) {
			if(person.getGender().equals(Gender.FEMALE)) {
				females.add(person);
			}
		}
		System.out.println("----Imperative Approach------");
		females.forEach(System.out::println);

		//Declarative approach
		//Filter
		List<Person> female = people
				.stream()
				.filter(person->person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		System.out.println("----Declarative Approach------");
		female.forEach(System.out::println);

		//Sort
		List<Person> sorted = people
				.stream()
				.sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge).reversed())
				.collect(Collectors.toList());
		sorted.forEach(System.out::println);

		//All Match
		boolean allMatch = people
				.stream()
				.allMatch(person->person.getAge() > 25);
		System.out.println(allMatch);

		//Any Match
		boolean anyMatch = people
				.stream()
				.anyMatch(person->person.getAge() == 23);
		System.out.println(anyMatch);

		//None Match
		boolean noneMatch = people
				.stream()
				.noneMatch(person->person.getName().equals("Pandiyan"));
		System.out.println(noneMatch);

		//Max
		people
		.stream()
		.max(Comparator.comparing(Person::getAge))
		.ifPresent(System.out::println);

		//Min
		Optional<Person> min = people
				.stream()
				.min(Comparator.comparing(Person::getAge));
		System.out.println(min);

		//Group
		Map<Gender, List<Person>> groupByGender = people
				.stream()
				.collect(Collectors.groupingBy(Person::getGender)); //each gender consider to key

		groupByGender
		.forEach((gender,listOfPerson)->{
			System.out.println(gender);
			listOfPerson.forEach(System.out::println);
			System.out.println();
		});

		for (Map.Entry<Gender, List<Person>> personEntry : groupByGender.entrySet()) {
			System.out.println(personEntry.getKey() + ":" + personEntry.getValue());
			System.out.println();
		}

		//Chaining
		Optional<String> oldestPerson = people
				.stream()
				.filter(person -> person.getGender().equals(Gender.MALE))
				.max(Comparator.comparing(Person::getAge))
				.map(person->person.getName());
		oldestPerson.ifPresent(System.out::println);
	}
	public static List<Person> getAllPerson() {
		return List.of(
				new Person("Marudhu", 23, Gender.MALE),
				new Person("Ayyappan", 23, Gender.MALE),
				new Person("Mathiyalagan", 24, Gender.MALE),
				new Person("Priyanka", 24, Gender.FEMALE),
				new Person("Anushka", 25, Gender.FEMALE)
				);
	}

}
