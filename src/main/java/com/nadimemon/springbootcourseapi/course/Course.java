package com.nadimemon.springbootcourseapi.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import com.nadimemon.springbootcourseapi.topic.Topic;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
    @JoinColumn(name = "topic_id", nullable = false)
	private Topic topic;
	
	public Course() {
	}
	
	public Course(String id, String name, String description, Topic topic) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic=topic;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
