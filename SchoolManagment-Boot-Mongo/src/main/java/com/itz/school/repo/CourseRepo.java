package com.itz.school.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itz.school.model.Course;

public interface CourseRepo extends MongoRepository<Course, Integer>{
	
	
}//EndOfInterface
