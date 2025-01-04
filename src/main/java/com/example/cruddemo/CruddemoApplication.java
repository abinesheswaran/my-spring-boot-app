package com.example.cruddemo;

import com.example.cruddemo.dao.AppDAO;
import com.example.cruddemo.entity.Instructor;
import com.example.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {
			createInstructor(appDAO);
		};
	}

	private void createInstructor(AppDAO appDAO) {
		Instructor instructor = new Instructor("Chad","Darby","darby@gmail.com");
		InstructorDetail instructorDetail = new InstructorDetail("link youtube","coding...");
		instructor.setInstructorDetail(instructorDetail);
		System.out.println("Saving instructor: "+instructorDetail);
		appDAO.save(instructor);
		System.out.println("Done!");
		System.out.println(appDAO.findById(9));
		appDAO.deleteAll();
	}
}
