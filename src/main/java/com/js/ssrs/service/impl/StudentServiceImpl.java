package com.js.ssrs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.ssrs.entity.Student;
import com.js.ssrs.repository.StudentRepository;
import com.js.ssrs.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {

		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public Student findById(int studentId) {
		return studentRepository.findById(studentId).get();
	}

	@Override
	public void deleteById(int studentId) {
		studentRepository.deleteById(studentId);
		
	}

	
}
