package com.scraping;

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

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Employee implements Serializable{
	Document doc = null;
	private static Scanner x;
	String link;
	String name;
	public Employee(String link, String name) {
		super();
		this.link = link;
		this.name = name;
	}
	public Employee() {
		super();
	}

	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Send Data
	public void writeFile(String link, String name)
	 {
		
		this.link=link;
		this.name = name;
		
		String x =link+"\t"+name+"\r\n";
	     
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
	
	//*********** Scrapper Code
	
	public void scrap() {
		try {
			doc = Jsoup.connect("https://jsoup.org/download").get();
			
//			String title = doc.title();
//			System.out.println("Title : "+title);
			Elements links = doc.select("a[href]");
			
			for (Element link : links) {	
				System.out.println("\n Link : "+ link.attr("href"));
				System.out.println("Text :"+ link.text());
				String url = "Link : "+link.attr("href")+"\t";
				String text = "Text : " +link.text();
				this.writeFile(url, text);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	// Remove all data from File
	
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
