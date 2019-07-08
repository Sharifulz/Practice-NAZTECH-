package com.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="extstudent")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	Integer id;
	String name;
	String email;
	
	public Student() {
	}
	public Student(Integer id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	private Integer getId() {
		return id;
	}
	private void setId(Integer id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
}
