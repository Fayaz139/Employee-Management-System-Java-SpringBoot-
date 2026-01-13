package com.fayaz.project.service;

import java.util.List;
import com.fayaz.project.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();
    
    Employee getEmployeeById(Long id);
    
    void deleteEmployeeById(Long id);
}