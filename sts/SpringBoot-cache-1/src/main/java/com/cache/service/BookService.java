package com.cache.service;

import com.cache.dto.Book;

public interface BookService {
	Book addBook(Book book);

	Book updateBook(Book book);

	Book getBook(long id);

	String deleteBook(long id);
}