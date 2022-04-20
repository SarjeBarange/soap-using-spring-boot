package com.sarje.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sarje.dto.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
