package com.js.ssrs.service;

import java.util.List;

import com.js.ssrs.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public void save(Student student);

	public Student findById(int id);

	public void deleteById(int studentId);

}
