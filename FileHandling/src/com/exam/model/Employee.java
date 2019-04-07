package com.exam.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Serializable;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Employee implements Serializable{
	private static Scanner x;
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Send Data
	public void writeFile(int id, String name)
	 {
		
		this.id=id;
		this.name = name;
		
		String x =id+"\t"+name+"\r\n";
	     
	     Reader r = new InputStreamReader(System.in);
	     BufferedReader br = new BufferedReader(r);

	     try {
	             //prompt the user to input data
	    	 File file = new File("filename.txt");
	    	 FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	    	 BufferedWriter bw = new BufferedWriter(fw);
	         bw.write(x);   

	             System.out.println("Successfully Inserted");
	             bw.close();  

	     } catch (IOException e) {
	         e.printStackTrace();
	     }
	 }
	
	// Editing Record 
	
	//Edit Record
	 
		 public void editRecord(String filepath, String editTerm, String newId, String newname){
				String tempFile  ="temp.txt";
				File oldFile = new File(filepath);
				File newFile = new File(tempFile);
				String id ="";
				String name = "";
				try {
					FileWriter fw = new FileWriter(tempFile, true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					x = new Scanner(new File(filepath));
					//x.useDelimiter("[,\n]");
					
					while(x.hasNext()) {
						id = x.next();
						name = x.next();
						if(id.equals(editTerm)) {
							pw.println(newId +"\t"+newname);
						}else {
							pw.println(id +"\t"+name);
						}
					}
					x.close();
					pw.flush();
					pw.close();
					oldFile.delete();
					File dump = new File(filepath);
					newFile.renameTo(dump);
					System.out.println("Updated");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
		 
		 //Show All Data
		 
		 public void showData() {
			 File file = new File("filename.txt"); 
			  
			 BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(file));
				 String st; 
				 while ((st = br.readLine()) != null) {
					 	System.out.println(st);
					 }
				 	    
				 System.out.println("Data Showed");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 }
		 
		 //Remove Selected Data
		 
		 public void removeRecord(String filepath, String removeterm) {
				String tempFile ="temp.txt";
				File oldFile = new File(filepath);
				File newFile = new File(tempFile);
				String id=""; 
				String name="";
				try {
					FileWriter fw = new FileWriter(tempFile,true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					x = new Scanner(new File(filepath));
					//x.useDelimiter("[,\n]");
					
					while(x.hasNext()) {
						id = x.next();
						name= x.next();
						if(!id.equals(removeterm)) {
							pw.println(id+"\t"+name+ "\t");
						}
					}
					x.close();
					pw.flush();
					pw.close();
					oldFile.delete();
					File dump = new File(filepath);
					newFile.renameTo(dump);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		 
		 //Search Specific Data
		 
		 public void readRecord(String searchTerm, String filepath) {
				boolean found = false;
				String id ="";
				String name ="";
				try {
					x = new Scanner(new File(filepath));
					//x.useDelimiter("[\n]");
					while(x.hasNext() && !found) {
						id= x.next();
						name = x.next();
						if(id.equals(searchTerm)) {
							found = true;
						}
					}
					if(found) {
						JOptionPane.showMessageDialog(null,"id : "+ id + "\nname : "+ name);
					}else {
						JOptionPane.showMessageDialog(null, "Record Not Found");
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
		 
		 //Delete All Data
		 
		 public void deleteAllData() {
			 try {
					FileWriter fw = new FileWriter("filename.txt",false);
					System.out.println("Data Deleted");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
		 }
}
