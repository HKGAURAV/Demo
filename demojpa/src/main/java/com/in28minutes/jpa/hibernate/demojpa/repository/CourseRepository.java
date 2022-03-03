package com.in28minutes.jpa.hibernate.demojpa.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.hibernate.demojpa.entity.Course;

@Repository
public class CourseRepository {
		@Autowired
		EntityManager em;
		
		public Course findById(Long id) {
			return em.find(Course.class, id);
		}
		
}
