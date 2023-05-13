package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class ConsumerPersonExample {
	static Consumer<Movie> movie1=mov->System.out.println(mov);
	static Consumer<Movie>movie2=mov2->System.out.println(mov2.getName().toUpperCase());
	public static void main(String[] args) {
        List<Movie>list=new ArrayList<>();
        Movie movies1=new Movie("Bigil","Thalapathy",2020);
        Movie movies2=new Movie("Kabali","Rajini",2017);
        list.add(movies1);
        list.add(movies2);
        
        list.forEach(movie1);
        list.forEach(movie2);
	}
}
