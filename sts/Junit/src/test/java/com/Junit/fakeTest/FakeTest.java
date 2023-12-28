package com.Junit.fakeTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import com.Junit.test_Doubles.fake.Book;
import com.Junit.test_Doubles.fake.BookRepository;
import com.Junit.test_Doubles.fake.BookService;

public class FakeTest {

		
		@Test
		public void testFake(){
			BookRepository bookRepository = new FakeBookRepository();
			BookService bookService = new BookService(bookRepository);
			
			bookService.addBook(new Book("11", "Mock", 250, LocalDate.now()));
			bookService.addBook(new Book("12", "JUnit", 300, LocalDate.now()));
			
			assertEquals(2, bookService.findNumberOfBooks());
			
		}
		
		@Test
		public void testFakeWithMockito() {
			BookRepository bookRepository = mock(BookRepository.class);
			BookService bookService = new BookService(bookRepository);
			
			Book book1 = new  Book("11", "Mock", 250, LocalDate.now());
		Book book2= new Book("12", "JUnit", 300, LocalDate.now());
			
			
			Collection<Book> books = new ArrayList<>();
			books.add(book1);
			books.add(book2);
			
			when(bookRepository.findAll()).thenReturn(books);
			
			assertEquals(2, bookService.findNumberOfBooks());
		}
		
	}