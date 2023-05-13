package com.dailyCodeBuffer.LambdaExpression;

import java.util.List;
import java.util.function.Predicate;


public class Main implements CheckPerson {

	public static void printPersonOlderThan(List<Person> people, int age) {
		for (Person p : people) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	public static void printPersonWithInAgeRange(List<Person> people, int low, int high) {
		for (Person p : people) {
			if (low <= p.getAge() && p.getAge() <= high) {
				p.printPerson();
			}
		}
	}

	public static void printPerson(List<Person> peopleList, Predicate<Person> tester) {
		for (Person person : peopleList) {
			if (tester.test(person)) {
				person.printPerson();
			}
		}
	}

	public static void main(String[] args) {

		List<Person> people = Person.generateListOfPerson();
		//		printPersonOlderThan(people, 21);
		//		printPersonWithInAgeRange(people, 20, 22);
		printPerson(people, (p) -> p.getAge() >= 20); //Lambda expression
	}

	@Override
	public boolean test(Person p) {
		return false;
	}
}
