package com.crudrepo.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudrepo.example.pojo.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	
	
	@Query("SELECT t FROM Book t where t.bookName LIKE %?1%")
	List<Book> fetchBooksByName(String bookname);
	
	@Query("SELECT t FROM Book t where t.bookPrice=?1")
	List<Book> findBooksByPrice(Integer price);
	
	@Query(value="SELECT e.empid,e.empname,d.depname FROM sms.tblemployee e inner join sms.tbldepartment d on e.empdepid=d.depid", nativeQuery = true)
	List<Object> findEmployeeWithDepartment();
	
	/*
	 * List<Book> findAll(String title);
	 * 
	 * List<Book> findByName(String title);
	 * 
	 * List<Book> findByPrice(Integer price);
	 */
}
