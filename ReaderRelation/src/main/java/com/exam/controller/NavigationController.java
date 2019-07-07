package com.exam.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.exam.dao.ReaderContactDao;
import com.exam.dao.ReaderDao;
import com.exam.dao.ReaderOrderDao;
import com.exam.entity.BookOrder;
import com.exam.entity.Reader;
import com.exam.entity.ReaderContact;


@Controller
public class NavigationController {
	ModelAndView mView=new ModelAndView();
	
	@Autowired
	public ReaderDao readerDao;
	
	@Autowired
	public ReaderContactDao readerContactDao;
	
	@Autowired
	public ReaderOrderDao readerOrderDao;
	
	@RequestMapping("/")
	public ModelAndView sendHome() {
		mView.setViewName("index.html");
		System.out.println("******************  ");
		return mView;
	}
	
	ReaderContact readerContact = new ReaderContact();
	BookOrder bookOrder1 = new BookOrder();
	BookOrder bookOrder2 = new BookOrder();
	Reader reader = new Reader();
	List<BookOrder> order = new ArrayList<>();
	
	@RequestMapping("/submitForm")
	public ModelAndView fromForm(@RequestParam Map<String,String> requestParams) {
		bookOrder1.setBookName(requestParams.get("bookName1"));
		bookOrder2.setBookName(requestParams.get("bookName2"));
		readerContact.setPhone(requestParams.get("phone"));
		reader.setName(requestParams.get("name"));
		reader.setEmail(requestParams.get("email"));
		
		
		reader.setReaderBook(Arrays.asList(bookOrder1,bookOrder2));
		readerContact.setReader(reader);
		
		readerContactDao.save(readerContact);
		mView.setViewName("index.html");
		return mView;
	}

}
