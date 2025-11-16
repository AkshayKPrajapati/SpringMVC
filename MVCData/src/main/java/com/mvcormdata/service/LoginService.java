package com.mvcormdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.mvcormdata.repository.LoginRepository;

@Service
public class LoginService {
	//work like a interface
	//autowired -> repository
	@Autowired
	private LoginRepository loginRepository;
}
