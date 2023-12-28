package com.Junit.argumentCaptor;


public interface BookRepository {
	void save(Book book);
	Book findBookById(String bookId);
}