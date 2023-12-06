package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.model.DepartmentRequest;
import com.example.demo.repository.DepartmentRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository departmentRepository;

	@Autowired
	DepartmentServiceImpl(DepartmentRepository departmentRepository) {

		this.departmentRepository = departmentRepository;

	}

	@Override
	public Integer savingDepartment(DepartmentRequest departmentRequest) {
	    log.info("Saving department: {}", departmentRequest);
	    Department departmentToSave = new Department();
	    departmentToSave.setDAddress(departmentRequest.getDAddress());
	    departmentToSave.setDName(departmentRequest.getDName());
	    Department savedDepartment = departmentRepository.save(departmentToSave);
	    log.info("Department saved: {}", savedDepartment);
	    return savedDepartment.getDId(); // Assuming DId is the actual department ID property
	}


}
