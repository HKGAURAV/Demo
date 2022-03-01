package com.in28minutes.database.databasedemo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.jdbc.PersonjdbcDAO;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class DataDemoApplication implements CommandLineRunner {
	private Logger logger =  (Logger) LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonjdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All users->{}",dao.findAll());
	}

}