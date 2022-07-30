package com.developersview.ThymeleafDemoCrud.Repository;

import com.developersview.ThymeleafDemoCrud.dao.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author pranoy.chakraborty
 * @Date 30/07/22
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
