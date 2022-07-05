package com.crudrepo.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbldepartment")
public class DepartmentModel {
	
	@Id
	@Column(name="depid",nullable=false)
	private Integer depid;
	
	@Column(name="depname",nullable=false)
	private String depname;

	public Integer getDepid() {
		return depid;
	}

	public void setDepid(Integer depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}
	
	

}
