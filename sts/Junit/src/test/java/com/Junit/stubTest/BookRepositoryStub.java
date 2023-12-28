package com.Junit.stubTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.Junit.test_Doubles.stub.Book;
import com.Junit.test_Doubles.stub.BookRepository;

public class BookRepositoryStub implements BookRepository {
	@Override
	public List<Book> findNewBooks(int days) {
		List<Book> newBooks = new ArrayList<>();
		Book book1 = new Book("1234", "Mockito In Action", 500, LocalDate.now());
		Book book2 = new Book("1235", "JUnit 5 In Action", 400, LocalDate.now());
		
		newBooks.add(book1);
		newBooks.add(book2);
		
		return newBooks;
	}
}