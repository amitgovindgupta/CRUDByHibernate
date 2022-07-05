package com.crudrepo.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblauthor")
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer authorid;
	
	@Column(name="authorname")
	String authorname;
	
	@Column(name="bookid")
	Integer bookid;
	
	String bookname;
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Integer getAuthorid() {
		return authorid;
	}
	public void setAuthorid(Integer authorid) {
		this.authorid = authorid;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	

}
