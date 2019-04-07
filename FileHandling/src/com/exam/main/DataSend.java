package com.exam.main;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

import com.exam.model.Employee;

public class DataSend {
	private static Scanner x;
	public static void main(String[] args) {
		Employee em = new Employee();
		//***********Sending Data
		
			//em.writeFile(1,"Aklima");
		
		//************Editing Data
			//em.editRecord("filename.txt","6","5","Srabon");
		
		//Showing All Data From File
			//em.showData();
		
		//********REMOVE SPESIFIC DATA

			//em.removeRecord("filename.txt", "5");
		
		//*******Search Specific Data

			//em.readRecord("1","filename.txt");
		
		//********Delete All Data
		
			//em.deleteAllData();
	}
	
}
