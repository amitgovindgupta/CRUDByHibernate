package com.crudrepo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crudrepo.example.pojo.Book;
import com.crudrepo.example.pojo.DepartmentModel;
import com.crudrepo.example.service.InterfBook;
import com.crudrepo.example.service.InterfDepartment;

@Controller
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	InterfBook interfBook;
	
	@Autowired
	InterfDepartment interfDepartment;
	
	@GetMapping("/book/{bookid}")
	public ResponseEntity<List<Book>> getBookByBookId(@PathVariable("bookid") Integer bookid) {
		List<Book> book = interfBook.findByBookId(bookid);
		return new ResponseEntity<List<Book>>(book, HttpStatus.OK);
	}
	
	@GetMapping("/bookByprice/{price}")
	public ResponseEntity<List<Book>> getBookByPrice(@PathVariable("price") Integer price) {
		List<Book> book = interfBook.findByPrice(price);
		return new ResponseEntity<List<Book>>(book, HttpStatus.OK);
	}
	
	@PostMapping("/book")
	public ResponseEntity<Book> createBookEntry(@RequestBody Book book){
		Book b=interfBook.creatBookEntry(book);
		return new ResponseEntity<Book>(b, HttpStatus.OK);
		
	}
	
	@GetMapping("/bookByName/{bookname}")
	public ResponseEntity<List<Book>> getBookByPrice(@PathVariable("bookname") String bookname) {
		List<Book> book = interfBook.findByName(bookname);
		return new ResponseEntity<List<Book>>(book, HttpStatus.OK);
	}
	@GetMapping("/EmployeeWithDepartment")
	public ResponseEntity<List<Object>> findEmployeeWithDepartment() {
		List<Object> book = interfBook.findEmployeeWithDepartment();
		return new ResponseEntity<List<Object>>(book, HttpStatus.OK);
	}
	
	
	@GetMapping("/getAlldepartments")
	public ResponseEntity<List<DepartmentModel>> findAllDepartment() {
		List<DepartmentModel> listofdepts = interfDepartment.findAllDepartment();
		return new ResponseEntity<List<DepartmentModel>>(listofdepts, HttpStatus.OK);
	}

}
