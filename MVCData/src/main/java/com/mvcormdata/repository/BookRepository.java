package com.mvcormdata.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.mvcormdata.entity.Books;

public class BookRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//------------------------------------------------------//
	@Transactional
	public void addNewBook(Books books){
		this.hibernateTemplate.save(books);
		System.out.println("new book inserted successfully");
	}
	
	public List<Books> getBookDetails(){
		List<Books> books = this.hibernateTemplate.loadAll(Books.class);
		return books;
	}
	
	public Books getSingleBookById(int bookId){
		Books books = this.hibernateTemplate.get(Books.class, bookId);
		return books;
	}
	
	@Transactional
	public void deleteBooks(Books books){
		this.hibernateTemplate.delete(books);
		System.out.println("Book Deleted successfully");
	}
	
	@Transactional
	public void updateBookDetails(Books books){
		this.hibernateTemplate.update(books);
		System.out.println("Book updated successfully");
	}
}
