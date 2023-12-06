package com.example.demo.test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.entity.Department;
import com.example.demo.model.DepartmentRequest;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentServiceImpl;

@ExtendWith(MockitoExtension.class)
public class saveDepartment {
	@Mock
	private DepartmentRepository departmentRepository;
	@InjectMocks
	private DepartmentServiceImpl service;
	@Test
    void saveDepartment() {
        // Arrange
        DepartmentRequest departmentRequest = new DepartmentRequest();
        departmentRequest.setDName("EEE");
        departmentRequest.setDAddress("B-Block");

        // Mock the save method of the repository
        when(departmentRepository.save(any(Department.class))).thenReturn(new Department());

        // Act
        service.savingDepartment(departmentRequest);

        // Assert
        verify(departmentRepository).save(any(Department.class));
    }
}

