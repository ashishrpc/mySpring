package com.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dao.MyDao;
import com.jdbcTemplates.Student;
@Component
public class MyManagerImpl implements MyManager {
	
	private MyDao myDao;

	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("MyManager->fun()");
		myDao.myDaoFun();
	}
	@Override
	public List<Student> getUserList(){
		return myDao.getUserList();
		
	}
	public void deleteUser(Student student){
		myDao.deleteUser(student);
	}
	public Student getUser(int id){
		return myDao.getUser(id);
	}
	public void updateUser(Student student){
		myDao.updateUser(student);
	}
	public void saveUser(Student student){
		myDao.saveUser(student);
	}

}
