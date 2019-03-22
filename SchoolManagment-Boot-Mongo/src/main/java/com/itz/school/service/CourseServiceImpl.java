package com.itz.school.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itz.school.model.Course;
import com.itz.school.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo courseRepo;
	
	@Override
	public Course add(Course course) {
		return courseRepo.save(course);
	}

	@Override
	public List<Course> getAll() {
		return courseRepo.findAll();
	}

	@Override
	public Optional<Course> getById(int id) {
		return courseRepo.findById(id);
	}

	/*@Override
	public Course updateById(Course c,int id) {
		Course cs=courseRepo.find(id);
		cs.getcId();
		cs.setcName(c.getcName());
		cs.setcCode(c.getcCode());
		return courseRepo.save(cs);
	}*/
	
	@Override
	public void deleteById(Integer id) {
		courseRepo.deleteById(id);	
	}

}
