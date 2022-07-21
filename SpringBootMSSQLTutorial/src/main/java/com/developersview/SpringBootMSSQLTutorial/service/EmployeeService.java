package com.developersview.SpringBootMSSQLTutorial.service;

import com.developersview.SpringBootMSSQLTutorial.model.Employee;
import com.developersview.SpringBootMSSQLTutorial.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 21/07/22
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

}
