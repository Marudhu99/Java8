package com.java8;

//MethodReference
public class MethodReferenceExample2 {

	public static void main(String[] args) {

		IUser iuser=User::new;//constructor
		User user=iuser.getUser("java8");
		System.out.println(user.getName());
	}

}
@FunctionalInterface
interface IUser{
	User getUser(String name);
}
class User{
	private String name;
	
	

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}