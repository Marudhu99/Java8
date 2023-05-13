package com.Amingoscode.Optional;

import java.util.Optional;

public class Student {
	private String stdName;
	private String email;

	public Student() {

	}

	public Student(String stdName, String email) {
		this.stdName = stdName;
		this.email = email;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", email=" + email + "]";
	}
	
}
