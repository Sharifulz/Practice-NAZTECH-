package com.naztech.Services;
import com.naztech.Dao.Storeable;

public class Employee  {
	private String name=null;
	private String dateOfBirth=null;
	private int id=-1;
	private String designation=null;
	private double salary=0.00;
	private String dateOfJoin=null;

	
	
	
	
	private Employee() {
		
	}
	public Employee(int id) {
		  this.id=id;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		 this.id=id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}


	
	

}
