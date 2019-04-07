package com.exam.function;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class updateData {
	private static Scanner x;
	public static void main(String[] args) {
		String filepath ="filename.txt";
		String editTerm ="3";
		String newId ="2";
		String newName ="Amina";
		editRecord(filepath,editTerm,newId,newName);
		
	}
		public static void editRecord(String filepath, String editTerm, String newId, String newname){
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
}
