package com.Junit.bdd.stubbing;


import java.util.List;

public interface BookRepository {
	List<Book> findNewBooks(int days);
}