package com.exam.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dao.ReaderContactDao;
import com.exam.dao.ReaderDao;
import com.exam.dao.ReaderOrderDao;
import com.exam.entity.BookOrder;
import com.exam.entity.Reader;
import com.exam.entity.ReaderContact;
@RestController
@RequestMapping("/start")
public class ReaderController {

	@Autowired
	public ReaderDao readerDao;
	
	@Autowired
	public ReaderContactDao readerContactDao;
	
	@Autowired
	public ReaderOrderDao readerOrderDao;
	
	@GetMapping("/allOrder")
	public List<BookOrder> getConatct(){
		return readerOrderDao.findAll();
	}
	
	@GetMapping("/allReader")
	public List<Reader> getReader(){
		return readerDao.findAll();
	}
	@GetMapping("/allContact")
	public List<ReaderContact> getAllContact(){
		return readerContactDao.findAll();
	}
	
	@GetMapping("/saveOne/{name}")
	public List<ReaderContact> saveOne(@PathVariable("name") String name){
		
		ReaderContact readerContact = new ReaderContact();
		Reader reader = new Reader();
		BookOrder readerBook1 = new BookOrder();
		BookOrder readerBook2 = new BookOrder();

		
		reader.setName(name);
		reader.setReaderBook(Arrays.asList(readerBook1, readerBook2));
		readerContact.setReader(reader);
		
		readerContactDao.save(readerContact);
		
		return readerContactDao.findAll();
	}
	
}
