package com.Junit.test_Doubles.fake;
import java.util.Collection;

public interface BookRepository {
	void save(Book book);
	Collection<Book> findAll();
}