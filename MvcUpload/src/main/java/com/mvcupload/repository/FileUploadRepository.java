package com.mvcupload.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mvcupload.entity.FileInfo;

@Repository
public class FileUploadRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	//------------------------------------------------------------------------//
	@Transactional
	public void saveFile(FileInfo fileInfo){
		this.hibernateTemplate.save(fileInfo);
	}
	
	
	
	
	public List<FileInfo> getAllFile()
	{
		List<FileInfo> files = this.hibernateTemplate.loadAll(FileInfo.class);
		return files;
	}
	
	
}
