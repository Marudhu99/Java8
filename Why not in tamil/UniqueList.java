package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueList {
	public static void main(String[] args) {
		List<String>names= Arrays.asList("Marudhu","Kumaravel","Paruthi","Mugunthan","Mugunthan");
		List<String>uniqueList=new ArrayList<>();
		for(String name:names) {
			if(!uniqueList.contains(name)) {
				uniqueList.add(name);
			}
		}
		System.out.println("before in Java8:"+uniqueList);
		List<String>uniqueList1=names.stream().distinct().collect(Collectors.toList());
		System.out.println("In Java8:"+uniqueList1);
	}

}
