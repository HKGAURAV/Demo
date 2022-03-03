package com.in28minutes.jpa.hibernate.demojpa;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.demojpa.entity.Course;
import com.in28minutes.jpa.hibernate.demojpa.repository.CourseRepository;

@SpringBootApplication
public class DemojpaApplication implements CommandLineRunner {
	public Logger logger = LoggerFactory.getLogger(this.getClass());
			@Autowired
	private CourseRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DemojpaApplication.class, args);
	}
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			Course course = repository.findById(10001L);
			logger.info("Course 1001 ->{}",course);
		}
}
