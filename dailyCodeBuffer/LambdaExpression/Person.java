package com.dailyCodeBuffer.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

enum Sex {
	MALE, FEMALE
}

public class Person {
	private String name;
	private int age;
	private String emailAddress;
	private Sex gender;

	public Person() {

	}

	public Person(String name, int age, String emailAddress, Sex gender) {
		this.name = name;
		this.age = age;
		this.emailAddress = emailAddress;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", emailAddress=" + emailAddress + ", gender=" + gender + "]";
	}

	public void printPerson() {
		System.out.println(this.toString());
	}

	public static List<Person> generateListOfPerson() {
		List<Person> person = new ArrayList<>();
		person.add(new Person("Marudhu", 22, "marudhu@gmail.com", Sex.MALE));
		person.add(new Person("Arul", 20, "arul@gmail.com", Sex.MALE));
		person.add(new Person("Sarath", 18, "sarath@gmail.com", Sex.MALE));
		person.add(new Person("Ishwarya", 16, "ishwarya@gmail.com", Sex.FEMALE));

		return person;
	}

}
