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

import com.crudrepo.example.pojo.Author;
import com.crudrepo.example.service.InterfAuthor;

@Controller
@RequestMapping("/api")
public class AuthorController {
	
	@Autowired
	InterfAuthor interauthor;
	
	@PostMapping("/author")
	public ResponseEntity<Author> createAuthorEntry(@RequestBody Author author){
		Author b=interauthor.creatAuthorEntry(author);
		return new ResponseEntity<Author>(b, HttpStatus.OK);
		
	}
	
	@GetMapping("/authorByBookId/{bookid}")
	public ResponseEntity<List<Author>> getAuthorByBookId(@PathVariable("bookid") Integer bookid) {
		List<Author> authorlist = interauthor.AuthorfindByBookId(bookid);
		return new ResponseEntity<List<Author>>(authorlist, HttpStatus.OK);
	}

}
