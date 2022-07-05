package com.crudrepo.example.service;

import java.util.List;

import com.crudrepo.example.pojo.Author;

public interface InterfAuthor {
	
	Author creatAuthorEntry(Author author);
	List<Author> AuthorfindByBookId(Integer bookid);
}
