package com.Junit.annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.Junit.annotations.support.Book;
import com.Junit.annotations.support.BookRepo;
import com.Junit.annotations.support.BookService;


@ExtendWith(MockitoExtension.class)
public class AnnotationsTest {
	
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private BookRepo bookRepo;
	
	@Test
	public void demoCreateMocksUsingAnnotations() {
		Book book1 = new Book(1234, "Mockito In Action", 500);
		Book book2 = new Book(1235, "JUnit 5 In Action", 400);
		
		List<Book> newBooks = new ArrayList<>();
		newBooks.add(book1);
		newBooks.add(book2);
		
		when(bookRepo.findNewBooks(7)).thenReturn(newBooks);
		
		List<Book> newBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10, 7);
		
		assertEquals(2, newBooksWithAppliedDiscount.size());
		assertEquals(450, newBooksWithAppliedDiscount.get(0).getPrice());
		assertEquals(360, newBooksWithAppliedDiscount.get(1).getPrice());
	}

}