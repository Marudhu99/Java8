package com.java8;

public class Movies {
	private String movieName;
	private String actorName;
	private Integer releaseYear;
	
	public Movies() {
		
	}

	public Movies(String movieName, String actorName, Integer releaseYear) {
		super();
		this.movieName = movieName;
		this.actorName = actorName;
		this.releaseYear = releaseYear;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Movies [movieName=" + movieName + ", actorName=" + actorName + ", releaseYear="
				+ releaseYear + "]";
	}

}
