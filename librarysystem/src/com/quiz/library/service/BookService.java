package com.quiz.library.service;

import java.util.List;

import com.quiz.library.model.Book;

public interface BookService {
	public List<Book> getCompBooks();
	public List<Book> getNovels();
}
