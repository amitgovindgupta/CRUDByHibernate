package com.crudrepo.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudrepo.example.pojo.DepartmentModel;

@Repository
public interface DepartmentRepository extends CrudRepository<DepartmentModel, Integer> {
	
	@Query("SELECT t FROM DepartmentModel t")
	List<DepartmentModel> findAllDepartment();

}
