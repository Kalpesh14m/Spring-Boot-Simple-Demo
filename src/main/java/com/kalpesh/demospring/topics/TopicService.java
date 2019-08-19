package com.kalpesh.demospring.topics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

//	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
//			new Topic("Spring", "Spring Framework", "Spring Descraption"),
//			new Topic("Java", "Java 8", "Java Descraption"), new Topic("Python", "AIML, NLTK", "Python Descraption")));

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Optional<Topic> getTopicById(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topicObj) {
//		topics.stream().filter(t -> t.getId().equals(id)).forEach(item -> {
//			item.setDescraption(topicObj.getDescraption());
//			item.setName(topicObj.getName());
//		});

//		topics.forEach(topic -> {
//			if (topic.getId().equals(id)) {
//				topic.setDescraption(topicObj.getDescraption());
//				topic.setName(topicObj.getName());
//				return;
//			}
//		});
		topicRepository.save(topicObj);
	}

	public void deleteTopic(String id) {
//		topics.removeIf(item -> item.getId().equals(id));
		topicRepository.deleteById(id);
	}
}
