package com.Junit.annotations.support;


import java.util.List;

public interface BookRepo {
	List<Book> findNewBooks(int days);
}