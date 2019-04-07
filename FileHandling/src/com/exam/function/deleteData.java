package com.exam.function;

import java.io.FileWriter;
import java.io.IOException;

public class deleteData {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("filename.txt",false);
			System.out.println("Data Deleted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
