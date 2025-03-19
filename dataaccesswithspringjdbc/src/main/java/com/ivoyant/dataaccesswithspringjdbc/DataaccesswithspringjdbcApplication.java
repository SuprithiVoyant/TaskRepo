package com.ivoyant.dataaccesswithspringjdbc;

import com.ivoyant.dataaccesswithspringjdbc.model.Students;
import com.ivoyant.dataaccesswithspringjdbc.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataaccesswithspringjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DataaccesswithspringjdbcApplication.class, args);
		context.getBean(Students.class);

		Students std1 = context.getBean(Students.class);
		std1.setId(1);
		std1.setName("Superman");
		std1.setCourse("Science");
		std1.setGrade("A");

		Students std2 = context.getBean(Students.class);
		std1.setId(3);
		std1.setName("Batman");
		std1.setCourse("Science");
		std1.setGrade("B-");

		StudentRepo students = context.getBean(StudentRepo.class);
		students.save(std1);

		System.out.println(students.findAll());

		System.out.println(students.findById(101));

		System.out.println(students.getStudentCount());

		System.out.println(students.findByCourse("science"));

		System.out.println(students.findDistinctCourses());
	}
}

