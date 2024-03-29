package com.nadimemon.springbootcourseapi.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourse(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findAllByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).orElseThrow(
				()->new EntityNotFoundException("Requested course not found."));
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		if (courseRepository.existsById(id)) {
			courseRepository.deleteById(id);
		}
	}
	
	public List<Course> searchCourseById(String courseKey){
		List<Course> courses=new ArrayList<>();
		courseRepository.findByIdWith(courseKey).forEach(courses::add);
		if(courses.size()==0) {
			throw new EntityNotFoundException("Searched data not found.");
		}
		return courses;
	}

}
