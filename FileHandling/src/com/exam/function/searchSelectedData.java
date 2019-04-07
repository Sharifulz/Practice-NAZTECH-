package com.exam.function;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class searchSelectedData {
	private static Scanner x;
	public static void main(String[] args) {
		String filepath = "filename.txt";
		String searchTerm ="2";
		readRecord(searchTerm, filepath);
		
	}
	public static void readRecord(String searchTerm, String filepath) {
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
}
