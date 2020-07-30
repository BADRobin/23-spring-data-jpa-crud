package com.bryl.spring.data.jpa.crud.dao;

import com.bryl.spring.data.jpa.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
