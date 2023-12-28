package com.Junit.behaviour.verification;

public interface BookRepository {
	void save(Book book);

	Book findBookById(String bookId);
}