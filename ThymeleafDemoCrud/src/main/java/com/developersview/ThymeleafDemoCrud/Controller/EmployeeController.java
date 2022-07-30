package com.developersview.ThymeleafDemoCrud.Controller;

import com.developersview.ThymeleafDemoCrud.Service.EmployeeServiceImpl;
import com.developersview.ThymeleafDemoCrud.dao.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author pranoy.chakraborty
 * @Date 30/07/22
 */
@Controller
public class EmployeeController {

     @Autowired
     EmployeeServiceImpl employeeServiceImpl;

    /* @RequestMapping(value = "/employees", method = RequestMethod.GET)
     public ResponseEntity<List<Employee>> findAllEmployees(){
        return new ResponseEntity<>(employeeServiceImpl.findAll(), HttpStatus.OK);
     }*/

     @GetMapping("/employeelist")
     public String employeeList(Model model){
          model.addAttribute("employees", employeeServiceImpl.findAll());
          return "employeelist";
     }
}
