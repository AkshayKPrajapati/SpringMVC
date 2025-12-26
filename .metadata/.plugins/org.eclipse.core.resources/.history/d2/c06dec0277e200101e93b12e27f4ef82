package com.mvcupload.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcupload.entity.FileInfo;
import com.mvcupload.repository.FileUploadRepository;

@Service
public class FileUploadService {
	@Autowired
	private FileUploadRepository fileUploadRepository;
	
	public void saveFile(FileInfo fileInfo) {
		this.fileUploadRepository.saveFile(fileInfo);
		
	}
	
	
	public List<FileInfo> getFiles(){
		List<FileInfo> files = this.fileUploadRepository.getAllFile();
		return files;
	}
	
	public  FileInfo getSingleFile(int id ){
		FileInfo fileInfo	 = this.fileUploadRepository.getSingleFile(id);
		return fileInfo;
	};
}
