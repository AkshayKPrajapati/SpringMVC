package com.mvcormdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcormdata.entity.Books;
import com.mvcormdata.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	
	public void newBookStore(Books books){
		this.bookRepository.addNewBook(books);
	}
	
	public List<Books> getAllBookDetails(){
		List<Books> books = this.bookRepository.getBookDetails();
		return books;
	}

	public Books getSingleBookById(int bookId) {
		Books books = this.bookRepository.getSingleBookById(bookId);
		return books;
		
	}
	public void deleteBook(Books books){
		this.bookRepository.deleteBooks(books);
	}
	public void updateBooks(Books books){
		this.bookRepository.updateBookDetails(books);
	}
	
}
