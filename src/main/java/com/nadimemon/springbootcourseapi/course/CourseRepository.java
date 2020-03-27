package com.nadimemon.springbootcourseapi.course;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	@Query("SELECT c FROM Course c WHERE c.id LIKE %?1% ")
	List<Course> findByIdWith(String courseKey);

	Iterable<Course> findAllByTopicId(String topicId);
}
