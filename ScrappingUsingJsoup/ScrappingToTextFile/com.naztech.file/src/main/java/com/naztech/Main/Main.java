package com.naztech.Main;

import java.io.File;

import com.naztech.Model.modelClass;
import com.naztech.Services.Employee;

public class Main {
	public static void main(String[] args) {
		System.out.println("Minhaz Uddin");
		//File f=new File("file.txt");
		
		
		modelClass mc=new modelClass();
		mc.createFile("EmployeeInfo.txt");

		
		// mc.add(new Employee(2)); mc.add(new Employee(3)); mc.add(new Employee(4));
		// mc.add(new Employee(5));
		 
		//System.out.println(	mc.search(2));
		//mc.remove(2);
		//mc.add(new Employee(2));
		Employee e=new Employee(3);
		e.setName("Minhaz Uddin");
		mc.update(e);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * try { PrintWriter data=new PrintWriter(f); data.println("Minhaz Uddin");
		 * data.println(165); data.close();
		 * 
		 * Scanner input=new Scanner(f); String name=input.nextLine(); int
		 * id=input.nextInt(); data.close(); System.out.println(name+"\n"+id);
		 * 
		 * 
		 * } catch(IOException e) { System.out.println(e); }
		 */

		
	
	}

}
