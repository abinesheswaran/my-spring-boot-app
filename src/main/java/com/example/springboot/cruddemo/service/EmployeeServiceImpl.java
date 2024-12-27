package com.example.springboot.cruddemo.service;

import com.example.springboot.cruddemo.dao.EmployeeDAO;
import com.example.springboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return employeeDAO.findById(id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public Employee updateById(Integer id, Employee employee) {
        employee.setId(id);
        return employeeDAO.updateById(id, employee);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        employeeDAO.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteAll() {
        employeeDAO.deleteAll();
    }
}
