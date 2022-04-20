package com.sarje.serv;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sarje.dao.EmployeeRepository;
import com.sarje.dto.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployeeById(int empId) {
		Optional<Employee> opt = employeeRepository.findById(empId);
		return opt.get(); 
	}

	@Override
	public boolean addEmployee(Employee employee) {
		employee  = employeeRepository.save(employee);
		return true;
	}
	
	

}
