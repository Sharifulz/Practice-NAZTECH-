package com.naztech.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.naztech.Services.Employee;

public class modelClass {
	public String path=null;
	public File file=null;
	public void createFile(String fileName){
		try {
			this.file=  (this.path!=null)?new File(this.path+"/"+fileName) :new File("/"+fileName);
			//this.file= file.createNewFile()?file:null;
			this.path=fileName;
			System.out.println(file);
			this.file.createNewFile();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
}

	

	public boolean add(Employee obj) {
		// TODO Auto-generated method stub
		FileWriter fr=null;
		BufferedWriter br=null;
		String dataWithNewLine=obj.getId()+"\t"
		+obj.getName()+"\t"
		+obj.getDesignation()+"\t"
		+obj.getSalary()+"\t"
		+obj.getDateOfJoin()+"\r\n";
		
		try {
			fr=new FileWriter(this.path,true);
			br=new BufferedWriter(fr);
			br.write(dataWithNewLine);
		}
		catch(Exception e) {
			System.out.println(e);
		}finally{
			try {
				br.close();
				fr.close();
			}
			catch(Exception e) {
				
				System.out.println(e);
				return false;
			}
		}
		
		return true;
		
	
	}
	public boolean add(Employee obj,Boolean append) {
		// TODO Auto-generated method stub
		FileWriter fr=null;
		BufferedWriter br=null;
		String dataWithNewLine=obj.getId()+"\t"
		+obj.getName()+"\t"
		+obj.getDesignation()+"\t"
		+obj.getSalary()+"\t"
		+obj.getDateOfJoin()+"\r\n";
		
		try {
			fr=new FileWriter(this.path,append);
			br=new BufferedWriter(fr);
			br.write(dataWithNewLine);
		}
		catch(Exception e) {
			System.out.println(e);
		}finally{
			try {
				br.close();
				fr.close();
				//System.out.println("Closed");
			}
			catch(Exception e) {
				
				System.out.println(e);
				return false;
			}
		}
		
		return true;
		
	
	}
	public boolean remove(int id) {
		
		Boolean flag=false;
		FileWriter fw=null;
        String newData="";
        Employee emp=new Employee(-1);
        ArrayList<String> a=new ArrayList();
		BufferedWriter bw=null;
		try {
	        FileReader fr=new FileReader(this.path);    
	        BufferedReader br=new BufferedReader(fr);

	          String currentLine;    
	          while((currentLine=br.readLine())!=null){
	        	  String[] data=currentLine.split("\t");
	        	  if(Integer.parseInt(data[0].trim())!=id) {
	        		  emp.setId(Integer.parseInt(data[0]));
	        		  emp.setName(data[1]);
	        		  emp.setDesignation(data[2]);
	        		  emp.setSalary(Double.parseDouble(data[3]));
	        		  emp.setDateOfJoin(data[4]);
	        		  add(emp,flag);
	        		  System.out.println(flag);
	        		  flag=true;
	        	  }
	          }
				try {
					br.close();
					fr.close();
					//System.out.println("Closed");
				}
				catch(Exception e) {
					System.out.println(e);
					return false;
				}
	          System.out.println("This is our new data:"+newData);
		}catch(Exception e) {
			System.out.println(e);
		}
		return flag;
	}
	public String search(int id) {
		// TODO Auto-generated method stub
		try {
	        FileReader fr=new FileReader(path);    
	        BufferedReader br=new BufferedReader(fr);
	          String currentLine;    
	          while((currentLine=br.readLine())!=null){
	        	  String[] data=currentLine.split("\t");
	        	  if(Integer.parseInt(data[0].trim())==id) {
	        		  return currentLine;
	        	  }
	          }  
	        
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public boolean update(Employee obj) {
		Boolean flag=false;
		FileWriter fw=null;
        String newData="";
        Employee emp=new Employee(-1);
        ArrayList<String> a=new ArrayList();
		BufferedWriter bw=null;
		try {
	        FileReader fr=new FileReader(this.path);    
	        BufferedReader br=new BufferedReader(fr);
	          String currentLine;    
	          while((currentLine=br.readLine())!=null){
	        	  String[] data=currentLine.split("\t");
	        	  if(Integer.parseInt(data[0].trim())!=obj.getId()) {
	        		  emp.setId(Integer.parseInt(data[0]));
	        		  emp.setName(data[1]);
	        		  emp.setDesignation(data[2]);
	        		  emp.setSalary(Double.parseDouble(data[3]));
	        		  emp.setDateOfJoin(data[4]);
	        		  add(emp,flag);
	        		  System.out.println(flag);
	        		  flag=true;
	        	  }
	        	  else {
	        		  add(obj,flag);
	        		  //System.out.println(flag);
	        		  flag=true; 
	        	  }
	          }
				try {
					br.close();
					fr.close();
				}
				catch(Exception e) {
					System.out.println(e);
					return false;
				}
	          System.out.println("This is our new data:"+newData);
		}catch(Exception e) {
			System.out.println(e);
		}
		return flag;
	}	

}

