package com.crudrepo.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudrepo.example.pojo.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
	
	@Query("SELECT t FROM Author t where t.bookid=?1")
	List<Author> AuthorfetchBooksId(Integer bookid);

}
