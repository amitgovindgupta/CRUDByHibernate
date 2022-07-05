package com.crudrepo.example.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudrepo.example.pojo.Author;
import com.crudrepo.example.pojo.Book;
import com.crudrepo.example.repository.AuthorRepository;
import com.crudrepo.example.repository.BookRepository;
import com.crudrepo.example.service.InterfAuthor;

@Service
public class AuthorImpl implements InterfAuthor {
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Author creatAuthorEntry(Author author) {
		authorRepository.save(author);
		return author;
	}

	@Override
	public List<Author> AuthorfindByBookId(Integer bookid) {
		Optional<Book> b=bookRepository.findById(bookid);
		List<Author> listAuthors= new ArrayList<>();
		listAuthors=authorRepository.AuthorfetchBooksId(bookid);
		Author author=listAuthors.get(0);
		author.setBookname(b.get().getBookName());
		listAuthors.clear();
		listAuthors.add(author);
		return listAuthors;
	}

}
