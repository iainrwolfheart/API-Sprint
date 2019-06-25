package com.qa.nbsapisprint.apisprint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Friends {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String secondName;
	private int age;
	
	public Friends() 
	{
		
	}
	
	public Friends(Long id, String firstName, String secondName, int age) 
	{
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String firstName() {
		return firstName;
	}
	public String secondName() {
		return secondName;
	}
	public int age() {
		return age;
	}

	public void setTodoName(String todoName) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", Name =" + firstName + secondName + "]";
	}
}
