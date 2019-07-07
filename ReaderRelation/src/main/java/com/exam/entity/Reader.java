package com.exam.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="reader")
public class Reader {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="reader_id")
	Integer id;
	String name;
	String email;
	
	@OneToMany(cascade=CascadeType.ALL   )
	@JoinColumn(name="reader_id", referencedColumnName="reader_id")
	private List<BookOrder> readerBook;
	
	
	
	public List<BookOrder> getReaderBook() {
		return readerBook;
	}
	public void setReaderBook(List<BookOrder> readerBook) {
		this.readerBook = readerBook;
	}
	public Reader() {
	}
	public Integer getId() {
		return id;
	}
	public Reader setId(Integer id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Reader setName(String name) {
		this.name = name;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public Reader setEmail(String email) {
		this.email = email;
		return this;
	}
	
}
