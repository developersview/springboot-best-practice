package com.developersview.SpringBootMSSQLTutorial.controller;

import javax.validation.Valid;

import com.developersview.SpringBootMSSQLTutorial.exception.ResourceNotFoundException;
import com.developersview.SpringBootMSSQLTutorial.model.Employee;
import com.developersview.SpringBootMSSQLTutorial.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @author pranoy.chakraborty
 * @Date 13/07/22
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    public EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeByID(@PathVariable(value = "id") long id) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/employee")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                   @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employee.setEmailID(employeeDetails.getEmailID());
        employee.setLastName(employeeDetails.getLastName());
        employee.setFirstName(employeeDetails.getFirstName());
        final Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
