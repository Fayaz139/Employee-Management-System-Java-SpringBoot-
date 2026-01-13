package com.fayaz.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fayaz.project.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}