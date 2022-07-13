package com.developersview.SpringBootMSSQLTutorial.repository;

import com.developersview.SpringBootMSSQLTutorial.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author pranoy.chakraborty
 * @Date 13/07/22
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
