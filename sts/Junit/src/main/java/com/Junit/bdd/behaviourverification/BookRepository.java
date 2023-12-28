package com.Junit.bdd.behaviourverification;

public interface BookRepository {
	void save(Book book);

	Book findBookById(String bookId);
}