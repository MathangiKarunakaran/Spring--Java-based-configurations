package com.krishantha.sms;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishantha.sms.model.Student;
import com.krishantha.sms.service.StudentService;
import com.krishantha.sms.service.StudentServiceImpl;

@Configuration
@ComponentScan("com.krishantha")
public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationcontext= new AnnotationConfigApplicationContext(Application.class);
		
		//StudentService service = new StudentServiceImpl();
		
		StudentService service = applicationcontext.getBean("studentService", StudentService.class);
		List<Student> students = service.fetchAllStudents();
		
		for (Student student : students) {
			System.out.println(student.getName() + " studied at " + student.getCollege());
		}
	}
}
