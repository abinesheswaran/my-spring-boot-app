package com.web_app.springboot.demo.my_spring_boot_app.myapp.dao;

import com.web_app.springboot.demo.my_spring_boot_app.myapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    void save (Employee employee);
    Employee findById(Integer id);
    List<Employee> findAll();
    List<Employee> findByName(String name);
}
