package com.Junit.mockTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.Junit.test_Doubles.mock.Book;
import com.Junit.test_Doubles.mock.BookRepository;

public class BookRepositoryMock implements BookRepository {
	
	int saveCalled = 0;
	Book lastAddedBook = null;
	
	@Override
	public void save(Book book) {
		saveCalled++;
		lastAddedBook = book;
	}
	
	public void verify(Book book, int times){
		assertEquals(times, saveCalled);
		assertEquals(book, lastAddedBook);
	}
	
}