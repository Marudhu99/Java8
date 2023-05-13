package com.java8;

public class Movie {
	private String name;
	private String actor;
	private Integer releasedYear;
	
	public Movie() {
		
	}

	public Movie(String name, String actor, Integer releasedYear) {
		super();
		this.name = name;
		this.actor = actor;
		this.releasedYear = releasedYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Integer getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(Integer releasedYear) {
		this.releasedYear = releasedYear;
	}

}
