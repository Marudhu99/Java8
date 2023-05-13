package com.dailyCodeBuffer.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamApiDemo {

	static List<Employee> employees = new ArrayList<>();
	static {
		employees.add(new Employee("Marudhu", "Pandiyan", 15000,
				Arrays.asList("EmployeeManagementSystem", "Virsec", "Helixbeat")));
		employees.add(new Employee("Arul", "Pandiyan", 20000, Arrays.asList("Youtube", "Shortfilm")));
		employees.add(new Employee("Sarath", "Kumar", 10000, Arrays.asList("Youtube", "CollegeProject", "Helixbeat")));
		employees.add(new Employee("Ishwarya", "Vadivel", 1000, Arrays.asList("Education", "Scientific")));
		employees.add(new Employee("Bala", "Murgan", 500, List.of("Education", "Youtube", "")));
	}

	public static void main(String[] args) {

		//forEach
		employees.stream().forEach(employee -> System.out.println(employee));

		//map
		//collect
		List<Employee> salaryIncreasedEmployees = employees.stream()
				.map(employee -> new Employee(
						employee.getFirstName(),
						employee.getLastName(),
						employee.getSalary() * 1.10,
						employee.getProjects()
						))
				.collect(Collectors.toList());

		System.out.println(salaryIncreasedEmployees);

		//filter
		List<Employee> filterEmployees = employees.stream()
				.filter(employee -> employee.getSalary() >= 15000)
				.map(employee -> new Employee(
						employee.getFirstName(),
						employee.getLastName(),
						employee.getSalary() * 1.10,
						employee.getProjects()
						))
				.collect(Collectors.toList());

		System.out.println(filterEmployees);

		//findFirst
		Employee firstEmployee = employees.stream()
				.filter(employee -> employee.getSalary() >= 15000)
				.map(employee -> new Employee(
						employee.getFirstName(),
						employee.getLastName(),
						employee.getSalary() * 1.10,
						employee.getProjects()
						))
				.findFirst()
				.orElse(null);

		System.out.println(firstEmployee);

		//flatMap
		String projects = employees.stream()  // stream of list of employees
				.map(employee -> employee.getProjects()) // stream of list of string
				.flatMap(Strings -> Strings.stream()) // stream of string . flatMap should be return stream of elements
				.collect(Collectors.joining(","));

		System.out.println(projects);

		//short circuit
		List<Employee> shortCircuit = employees
				.stream()
				.skip(1)
				.limit(1)
				.collect(Collectors.toList());
		System.out.println(shortCircuit);

		//finite operation
		Stream.generate(Math::random)
		.limit(5)
		.forEach(value -> System.out.println(value));

		//sorting
		List<Employee> sortedEmployeeFirstName = employees
				.stream()
				.sorted((o1,o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
				.collect(Collectors.toList());
		System.out.println(sortedEmployeeFirstName);

		//max
		Employee maxSalary = employees
				.stream()
				.max(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(maxSalary);

		//min
		Employee minSalary = employees
				.stream()
				.min(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchElementException::new);
		System.out.println(minSalary);

		//reduce
		Double totalSalary = employees	
				.stream()
				.map(employee -> employee.getSalary())
				.reduce(0.0,Double::sum);
		System.out.println(totalSalary);

	}

}
