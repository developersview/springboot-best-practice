package com.developersview.ThymeleafDemoCrud.Service;

import com.developersview.ThymeleafDemoCrud.Repository.EmployeeRepository;
import com.developersview.ThymeleafDemoCrud.dao.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 30/07/22
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
