package com.crudrepo.example.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudrepo.example.pojo.DepartmentModel;
import com.crudrepo.example.repository.DepartmentRepository;
import com.crudrepo.example.service.InterfDepartment;

@Service
public class DepartmentImpl implements InterfDepartment {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	public List<DepartmentModel> findAllDepartment() {

		List<DepartmentModel> ls=departmentRepository.findAllDepartment();
		System.out.println("Departments are retrieved...");
		return ls;
	}
	

}
