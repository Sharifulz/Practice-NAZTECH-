package com.exam.function;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class deleteSelectedData {
	private static Scanner x;

	public static void main(String[] args) {
		String filepath = "filename.txt";
		String removeTerm="2";
		removeRecord(filepath, removeTerm);
	}

	public static void removeRecord(String filepath, String removeterm) {
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
}
