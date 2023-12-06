package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DepartmentRequest;
import com.example.demo.service.DepartmentService;

import lombok.extern.log4j.Log4j2;

@RestController

@Log4j2
public class DepartmentController {

	private DepartmentService departmentService;

	@Autowired
	DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;

	}

	@PostMapping("/save")
	
	ResponseEntity<Integer> saveDepartment(@RequestBody DepartmentRequest departmentRequest) {
		log.info("Received request to save department: {}", departmentRequest);
		Integer departmentId = departmentService.savingDepartment(departmentRequest);
		log.info("Department saved with ID: {}", departmentId);
		return new ResponseEntity<>(departmentId, HttpStatus.CREATED);
	}

	@GetMapping("/get")

	String getData() {
		return "Hello Reddy";
	}

}
