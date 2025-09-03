package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student(id, name, city) values(?,?,?)";
		int r = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		String query = "update student set name=?, city=? where id = ?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	@Override
	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;

	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		return this.jdbcTemplate.queryForObject(query, rowMapper, studentId);

	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String query = "select * from student";
		List<Student> student = this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}

}
