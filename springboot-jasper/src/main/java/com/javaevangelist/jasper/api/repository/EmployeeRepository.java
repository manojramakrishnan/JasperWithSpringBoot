package com.javaevangelist.jasper.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.javaevangelist.jasper.api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
