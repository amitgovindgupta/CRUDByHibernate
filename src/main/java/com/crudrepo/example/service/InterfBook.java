package com.crudrepo.example.service;

import java.util.List;

import com.crudrepo.example.pojo.Book;

public interface InterfBook {
	
	List<Book> findAll();
	List<Object> findEmployeeWithDepartment();
	List<Book> findByBookId(Integer bookId);
    List<Book> findByPrice(Integer price);
    List<Book> findByName(String bookname);
    Book creatBookEntry(Book book);
}
