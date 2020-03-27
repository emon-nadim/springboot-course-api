package com.nadimemon.springbootcourseapi.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadimemon.springbootcourseapi.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/topics/{topicId}/courses", method = RequestMethod.GET)
	public List<Course> getCourses(@PathVariable String topicId) {
		return courseService.getAllCourse(topicId);
	}
	
	@RequestMapping(value="/topics/{topicId}/courses/{id}", method=RequestMethod.GET)
	public Course getCourse(@PathVariable("topicId") String topicId, @PathVariable("id") String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(value="/topics/{topicId}/courses", method=RequestMethod.POST)
	public void addCourse(@PathVariable("topicId") String topicId, @RequestBody Course course) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(value="topics/{topicId}/courses", method=RequestMethod.PUT)
	public void updateCourse(@PathVariable("topicId") String topicId, @RequestBody Course course) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(topicId, course);
	}
	
	@RequestMapping(value="topics/{topicId}/courses/{id}", method=RequestMethod.DELETE)
	public void deleteCourse(@PathVariable("topicId") String topicId, @PathVariable("id") String id) {
		courseService.deleteCourse(id);
	}
	
	@RequestMapping(value="/courses/search/{courseKey}", method=RequestMethod.GET)
	public List<Course> searchCourseById(@PathVariable String courseKey){
		return courseService.searchCourseById(courseKey);
	}
}
