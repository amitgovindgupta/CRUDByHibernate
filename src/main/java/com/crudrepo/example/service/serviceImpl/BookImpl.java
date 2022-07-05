package com.crudrepo.example.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudrepo.example.pojo.Book;
import com.crudrepo.example.repository.BookRepository;
import com.crudrepo.example.service.InterfBook;

@Service
public class BookImpl implements InterfBook {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> findByPrice(Integer price) {
		Book b = new Book();
		List<Book> list = new ArrayList<>();
		try {
			int k = price;
			list= bookRepository.findBooksByPrice(k);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return list;
	}

	@Override
	public List<Book> findAll() {
		List<Book> list = new ArrayList<>();
		bookRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public List<Book> findByBookId(Integer bookId) {
		Book b = new Book();
		List<Book> list = new ArrayList<>();
		b = bookRepository.findById(bookId).get();
		list.add(b);
		return list;
	}

	@Override
	public Book creatBookEntry(Book book) {
		bookRepository.save(book);
		return book;
	}

	@Override
	public List<Book> findByName(String bookname) {
		List<Book> list = new ArrayList<>();
		list = bookRepository.fetchBooksByName(bookname);
		return list;
	}

	@Override
	public List<Object> findEmployeeWithDepartment() {
		List<Object> list = new ArrayList<>();
		list=bookRepository.findEmployeeWithDepartment();
		return list;
	}

}
