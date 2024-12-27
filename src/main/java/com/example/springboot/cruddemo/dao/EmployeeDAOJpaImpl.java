package com.example.springboot.cruddemo.dao;

import com.example.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.apache.tomcat.util.threads.TaskQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> employees = query.getResultList();
        return employees;
    }

    @Override
    public Employee findById(Integer id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        employee.setId(null);
        Employee dbEmployee = entityManager.merge(employee);
        return dbEmployee;
    }

    @Override
    public Employee updateById(Integer id, Employee employee) {
        Employee dbEmployee = entityManager.merge(employee);
        return dbEmployee;
    }

    @Override
    public void deleteById(Integer id) {
//        TypedQuery<Employee> query = entityManager.createQuery("from Employee where id=:theId", Employee.class);
//        query.setParameter("theId", id);
//        Employee employee = query.getSingleResult();
//        entityManager.remove(employee);
        Query query = entityManager.createQuery("delete from Employee where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void deleteAll() {
        entityManager.createQuery("delete from Employee").executeUpdate();
    }
}
