package com.krishantha.sms.repository;

import java.util.List;

import com.krishantha.sms.model.Student;

public interface StudentRepository {

	/* (non-Javadoc)
	 * @see com.krishantha.sms.repository.StudentRepository2#fetchAllStudent()
	 */
	List<Student> fetchAllStudent();

}