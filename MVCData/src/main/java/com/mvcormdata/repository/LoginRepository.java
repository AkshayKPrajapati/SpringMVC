package com.mvcormdata.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.mvcormdata.entity.Login;

public class LoginRepository {
	//communication to the database
	//auto wired -> hibernaate
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	// save the data
	@Transactional
	public void saveLoginCredentials(Login  login){
		this.hibernateTemplate.save(login);
		System.out.println("Login Credential Successfully");
	}
	
	
	//get all data
	public List<Login> getAllLoginDetails(){
		List<Login> login = this.hibernateTemplate.loadAll(Login.class);
		return  login;
	 
	}
	
	
}
