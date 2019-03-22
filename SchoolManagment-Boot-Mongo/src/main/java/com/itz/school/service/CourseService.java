package com.itz.school.service;

import java.util.List;
import java.util.Optional;

import com.itz.school.model.Course;

public interface CourseService {
	
	public Course add(Course course);
	public List<Course> getAll();
	public Optional<Course> getById(int id);
//	public Course updateById(Course c,int id);
	public void deleteById(Integer id);
	
}//EndOfInteface
