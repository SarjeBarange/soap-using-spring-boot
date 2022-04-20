package com.sarje.serv;

import com.sarje.dto.Employee;

public interface EmployeeService {
	Employee getEmployeeById(int empId);
	boolean addEmployee(Employee employee);
}
