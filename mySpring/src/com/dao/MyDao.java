package com.dao;

import java.util.List;

import com.jdbcTemplates.Student;

public interface MyDao {
	public void myDaoFun();
	public List<Student> getUserList();
	public void deleteUser(Student student);
	public Student getUser(int id);
	public void updateUser(Student student);
	public void saveUser(Student student);
}
