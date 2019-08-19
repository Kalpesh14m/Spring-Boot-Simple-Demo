package com.kalpesh.demospring.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.kalpesh.demospring.topics.Topic;

@Entity
public class Course {
	@Id
	private String id;
	private String name;
	private String descraption;

	@ManyToOne
	private Topic topic;

	public Course() {
	}

	public Course(String id, String name, String descraption, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.descraption = descraption;
		this.topic = new Topic(topicId, "", "");
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

	public String getDescraption() {
		return descraption;
	}

	public void setDescraption(String descraption) {
		this.descraption = descraption;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
