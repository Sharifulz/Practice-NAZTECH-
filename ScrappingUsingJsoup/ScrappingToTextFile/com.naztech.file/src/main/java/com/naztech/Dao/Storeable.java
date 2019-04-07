package com.naztech.Dao;

import com.naztech.Services.Employee;

public interface Storeable {
	boolean add(Object obj);
	boolean remove(int id);
	Employee search(int id);
	boolean update(Object obj);
	
	

}
