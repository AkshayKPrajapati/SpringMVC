package com.mvcormdata.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

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
}
