package com.quiz.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.quiz.library.model.Book;
import com.quiz.library.service.BookService;

@Controller
public class LibraryController {
	
	@Autowired
	BookService service;
	
	@RequestMapping("/compbooks")
	public ModelAndView getComp() {
		ModelAndView compview = new ModelAndView("lib-view");
		
		List<Book> books = service.getCompBooks();
		compview.addObject("bookList", books);
		
		return compview;
	}
	
	@RequestMapping("/novels")
	public ModelAndView getNovel() {
		ModelAndView novelview = new ModelAndView("lib-view");
		
		List<Book> books = service.getNovels();
		novelview.addObject("bookList", books);
		
		return novelview;
	}
}
