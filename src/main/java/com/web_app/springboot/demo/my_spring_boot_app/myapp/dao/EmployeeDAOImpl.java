package com.web_app.springboot.demo.my_spring_boot_app.myapp.dao;

import com.web_app.springboot.demo.my_spring_boot_app.myapp.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery theQuery = entityManager.createQuery("FROM Employee", Employee.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Employee> findByName(String name) {
        TypedQuery theQuery = entityManager.createQuery("FROM Employee where name=:theData", Employee.class);
        theQuery.setParameter("theData", name);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Integer id, Employee employee) {
        Employee theEmployee = entityManager.find(Employee.class, id);
        theEmployee.setName(employee.getName());
        theEmployee.setDepartment(employee.getDepartment());
        entityManager.merge(employee);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int rows = entityManager.createQuery("DELETE FROM Employee").executeUpdate();
        return rows;
    }
}
