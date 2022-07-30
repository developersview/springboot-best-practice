package com.developersview.ThymeleafDemoCrud.Service;

import com.developersview.ThymeleafDemoCrud.dao.Employee;

import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 30/07/22
 */
public interface EmployeeService {
    public List<Employee> findAll();
    //public Employee saveEmployee();
}
