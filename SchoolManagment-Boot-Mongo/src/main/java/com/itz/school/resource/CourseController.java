package com.itz.school.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itz.school.model.Course;
import com.itz.school.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/add")
	public String add(@RequestBody Course course) {
		courseService.add(course);
		return "Course Added with id :"+course.getcId();
	}//add
	
	@GetMapping("/getAll")
	public List<Course> getAll(){
		return courseService.getAll();
	}//getAll
	
	@GetMapping("/get/{id}")
	public Optional<Course> getById(@PathVariable int id){
		return courseService.getById(id);
	}//getById
	
	/*@PutMapping("/update/{id}")
	public String updateById(@RequestBody Course c,@PathVariable int id) {
		courseService.deleteById(id);
		return "Record Updated with id :"+id;
	}//delete
*/	
	@DeleteMapping("/del/{id}")
	public String deleteById(@PathVariable int id) {
		courseService.deleteById(id);
		return "Record Deleted with id :"+id;
	}//delete
	
}//EndOfController
