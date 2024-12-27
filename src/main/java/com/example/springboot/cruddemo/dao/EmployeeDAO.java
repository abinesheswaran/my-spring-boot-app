package com.example.springboot.cruddemo.dao;

import com.example.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(Integer id);

    Employee save(Employee employee);

    Employee updateById(Integer id, Employee employee);

    void deleteById(Integer id);

    void deleteAll();
}
