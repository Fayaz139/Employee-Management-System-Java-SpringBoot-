package com.fayaz.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fayaz.project.entity.Employee;
import com.fayaz.project.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

	@Override
	public Employee getEmployeeById(Long id) {
	    return employeeRepository.findById(id).orElse(null);
	}
	
	@Override
	public void deleteEmployeeById(Long id) {
	    employeeRepository.deleteById(id);
	}
}