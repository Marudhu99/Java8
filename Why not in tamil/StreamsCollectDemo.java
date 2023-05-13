package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsCollectDemo {

	public static void main(String[] args) {

		List<Movies>movieList=Arrays.asList(new Movies("Varisu","Vijay",2022),new Movies("Master","Thalapathy",2020),
				                               new Movies("Valimai","Thala",2021),new Movies("VikramVedha","Hrithik",2022),
				                               new Movies("VikramVedha","Hrithik",2022));
		List<String> list = movieList.stream().map(Movies::getMovieName).collect(Collectors.toList());
		list.forEach(System.out::println);// print all movie name
		
		Set<String> set = movieList.stream().map(Movies::getMovieName).collect(Collectors.toSet());
		set.forEach(System.out::println);/// print only unique movie name 
		
		String merge = movieList.stream().map(Movies::getMovieName).collect(Collectors.joining(","));
		
		Map<Integer, List<Movies>> map = movieList.stream().collect(Collectors.groupingBy(Movies::getReleaseYear));
		map.forEach((k,v)->System.out.println("key:"+k+" value:"+v));
		
		//find the average
		Double average = movieList.stream().collect(Collectors.averagingInt(Movies::getReleaseYear));
		System.out.println("Average of Released Year:"+average);
		
		Map<Boolean, List<Movies>> Movies2022 = movieList.stream().collect(Collectors.partitioningBy(m->m.getReleaseYear()==2022));
		Movies2022.forEach((k,v)->System.out.println("key:"+k+"value:"+v));
		
	}

}
