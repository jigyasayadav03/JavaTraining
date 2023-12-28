package com.Junit.fakeTest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.Junit.test_Doubles.fake.Book;
import com.Junit.test_Doubles.fake.BookRepository;

public class FakeBookRepository implements BookRepository {
	
	// In memory database, HashMap or List
	Map<String, Book> bookStore = new HashMap<>();
	
	@Override
	public void save(Book book) {
		bookStore.put(book.getBookId(), book);
	}
	
	@Override
	public Collection<Book> findAll() {
		return bookStore.values();
	}

	
}