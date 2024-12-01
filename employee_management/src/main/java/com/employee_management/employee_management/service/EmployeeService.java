package com.employee_management.employee_management.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.employee_management.employee_management.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getElementById(long id);
	
    void deleteEmployeeById(long id);
   
	Page<Employee> findPaginated(int pageNo, int pageSize);
	


}
