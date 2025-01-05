package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findById(int id);
    void delete(int id);
    void deleteAll();
    //
    InstructorDetail findDetailById(int id);
}
