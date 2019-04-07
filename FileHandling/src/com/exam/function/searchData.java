package com.exam.function;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/*
 * AUTHOR SHARIFUL ISLAM
 * DATE : MARCH 14, 2019
 * 
 */
public class searchData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
}
