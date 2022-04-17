package com.example.Pratice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Pratice.student.*;
import com.example.Pratice.student.StudentRepo;
import com.example.Pratice.review.*;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class PraticeApplication {

	public static void main(String[] args) {
		 ApplicationContext context =  SpringApplication.run(PraticeApplication.class, args);
		 
		 StudentRepo studentRepo = context.getBean(StudentRepo.class);
		 
		 
//		 String date =  studentRepo.getByDate("2022-03-18");
//		 
//		 
//		 System.out.println(date);
//		 date.forEach(e->{System.out.println(e)});
	}

}
