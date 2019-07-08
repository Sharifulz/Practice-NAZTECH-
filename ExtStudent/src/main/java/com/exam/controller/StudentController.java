package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.MvcNamespaceHandler;

@Controller
public class StudentController {
	
	ModelAndView mv = new ModelAndView();
	@RequestMapping("/")
	public ModelAndView sendHome() {
		mv.setViewName("index.html");
		return mv;
	}
}
