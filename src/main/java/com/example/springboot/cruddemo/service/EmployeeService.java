package com.example.springboot.cruddemo.service;

import com.example.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(Integer id);

    Employee save(Employee employee);

    Employee updateById(Integer id, Employee employee);

    void deleteById(Integer id);

    void deleteAll();
}
