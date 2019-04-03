package com.krishantha.sms.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.krishantha.sms.model.Student;
import com.krishantha.sms.service.StudentService;

@Repository

public class HibernateStudentRepositoryImpl implements StudentRepository  {
	
	/* (non-Javadoc)
	 * @see com.krishantha.sms.repository.StudentRepository2#fetchAllStudent()
	 */
	/* (non-Javadoc)
	 * @see com.krishantha.sms.repository.StudentRepository#fetchAllStudent()
	 */
	@Override
	public List<Student> fetchAllStudent(){
		List<Student> students = new ArrayList<>();
		
		Student student = new Student();
		student.setName("Mathangi");
		student.setCollege("Vembadi");
		students.add(student);
		return students;
	}
}
