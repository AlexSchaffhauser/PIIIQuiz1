package com.quiz.library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.library.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public List<Book> getCompBooks() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Programming I", "Reza", 2018 ));
		books.add(new Book("Programming II", "Reza", 2019 ));
		books.add(new Book("Programming III", "Reza", 2020 ));
		return books;
	}

	@Override
	public List<Book> getNovels() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Harry Potter", "J.K. Rowling", 2007 ));
		books.add(new Book("It", "Stephen King", 1999 ));
		books.add(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979 ));
		return books;
	}
}
