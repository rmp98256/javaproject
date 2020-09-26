package com.mayur.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue
	private int sid;

	private Name name;

	private int age;

	@ManyToMany(mappedBy ="student" ) // one student have many  laptop relationship student will make which is object in Laptop
	
	private List<Laptop> laptop = new ArrayList<Laptop>();

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

//to get and set  the First name and Last name 
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//to get and set  the laptop's lId and lName  
	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void  setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

//to print values of all in one object 

}
