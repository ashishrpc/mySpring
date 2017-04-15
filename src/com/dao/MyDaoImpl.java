package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbcTemplates.Student;
import com.jdbcTemplates.StudentMapper;

public class MyDaoImpl implements MyDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	@Override
	public void myDaoFun() {
		// TODO Auto-generated method stub
		System.out.println("MyDaoImpl->myDaoFun()");
		String SQL = "select * from Student";
//		String[] args={"",""};
		List <Student> students = jdbcTemplateObject.query(SQL, 
				new StudentMapper());
		System.out.println(students.size());
	}
	@Override
	public List<Student> getUserList(){
		List<Student> users=null;
		String sql="select * from student";
		users=jdbcTemplateObject.query(sql, new StudentMapper());
		return users;
	}
	public void deleteUser(Student student){
		String sql="Delete from student where id=?";
		Integer[] args={student.getId()};
		jdbcTemplateObject.update(sql, args);
	}
	public Student getUser(int id){
		String sql="select * from student where id=?";
		Integer[] args={id};
		return jdbcTemplateObject.queryForObject(sql, args, new StudentMapper());
	}
	public void updateUser(Student student){
		String sql="update student set age=?,name=? where id=?";
		Object[] args={student.getAge(),student.getName(),student.getId(),};
		jdbcTemplateObject.update(sql, args);
	}
	public void saveUser(Student student){
		String sql="insert into student(id,name,age) values(?,?,?)";
		Object[] args={student.getId(),student.getName(),student.getAge()};
		jdbcTemplateObject.update(sql, args);
	}
	
}
