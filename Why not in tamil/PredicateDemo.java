package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Predicate Functional Interface==>Input Object, Output Boolean
public class PredicateDemo {
	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<Movie>();
		Movie movie = new Movie("Vikram", "Kamal", 2022);

		Movie movie1 = new Movie("Kathi", "Vijay", 2017);

		movieList.add(movie);
		movieList.add(movie1);

		findMoviesIn2022(movieList);
		findMoviesByActor(movieList);
		getMovies(movieList,m->m.getReleasedYear()==2022);
		getMoviesByActor(movieList,m1->m1.getActor().equalsIgnoreCase("vijay"));
	}

	// find movie released in 2022
	public static void findMoviesIn2022(List<Movie> movieList) {
		for (Movie movies : movieList) {
			if (movies.getReleasedYear() == 2022) {
				System.out.println(movies.getName());
			}

		}
	}

	// find movie acting by Vijay
	public static void findMoviesByActor(List<Movie> movieList) {
		for (Movie movies : movieList) {
			if (movies.getActor().equalsIgnoreCase("Vijay")) {
				System.out.println(movies.getName());
			}
		}
	}
    //generic method
	public static void getMovies(List<Movie> movieList, Predicate<Movie> moviePredicate) {
          for(Movie movies:movieList) {
        	  if(moviePredicate.test(movies)) {
        		  	System.out.println(movies.getName());
        	  }
          }
	}
	public static void getMoviesByActor(List<Movie>movieList,Predicate<Movie>actorPredicate) {
		  for(Movie movies:movieList) {
			  if(actorPredicate.test(movies)) {
				  System.out.println(movies.getName());
			  }
		  }
	}
}
