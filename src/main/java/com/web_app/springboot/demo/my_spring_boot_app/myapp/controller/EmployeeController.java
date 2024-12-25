package com.web_app.springboot.demo.my_spring_boot_app.myapp.controller;

import com.web_app.springboot.demo.my_spring_boot_app.myapp.dao.EmployeeDAOImpl;
import com.web_app.springboot.demo.my_spring_boot_app.myapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        employeeDAO.save(employee);
        return employee;
    }

    @GetMapping
    public Employee getEmployee() {
        return employeeDAO.findById(1);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }

    @GetMapping("/byName/{name}")
    public List<Employee> getEmployeesbyName(@PathVariable String name){
        return employeeDAO.findByName(name);
    }

    @PostMapping("/update/{id}")
    public void updateEmployee(@PathVariable Integer id,@RequestBody Employee employee){
        employeeDAO.update(id,employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable Integer id){
        employeeDAO.delete(id);
    }

    @DeleteMapping
    public int deleteAll(){
        return employeeDAO.deleteAll();
    }
}
