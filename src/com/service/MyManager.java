package com.service;

import java.util.List;

import com.jdbcTemplates.Student;

public interface MyManager {
	public void fun();
	public List<Student> getUserList();
	public void deleteUser(Student student);
	public Student getUser(int id);
	public void updateUser(Student student);
	public void saveUser(Student student);
}