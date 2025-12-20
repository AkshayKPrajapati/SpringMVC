package com.mvcupload.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FileInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String fileName;
	private String filePath;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	@Override
	public String toString() {
		return "FileInfo [id=" + id + ", fileName=" + fileName + ", filePath=" + filePath + "]";
	}
	public FileInfo(int id, String fileName, String filePath) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.filePath = filePath;
	}
	public FileInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
