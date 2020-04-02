package com.nadimemon.springbootcourseapi.topic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadimemon.springbootcourseapi.exception.ErrorSource;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	public List<Topic> getAllTopic(){
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		Topic topic= topicRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Requested topic not found."));
		return topic;
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
	}
}
