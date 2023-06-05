package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Student;

public interface StudentService {
 
    Student addstudent( Student s);
    List<Student> getallstudents();
    Student getbyid(String id);
}
