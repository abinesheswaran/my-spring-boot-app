package com.web_app.springboot.demo.my_spring_boot_app.myapp.controller;

import com.web_app.springboot.demo.my_spring_boot_app.myapp.dao.EmployeeDAOImpl;
import com.web_app.springboot.demo.my_spring_boot_app.myapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeDAOImpl employeeDAO;

    @Autowired
    public EmployeeController(EmployeeDAOImpl theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        Employee employee1 = new Employee("abinesh", "IT");
        employeeDAO.save(employee1);
        return employee1;
    }

    @GetMapping
    public Employee getEmployee() {
        return employeeDAO.find(1);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }
}
