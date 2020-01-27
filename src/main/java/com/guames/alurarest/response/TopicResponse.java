package com.guames.alurarest.response;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.guames.alurarest.domain.Topic;

import lombok.Getter;

@Getter
public class TopicResponse {

	private Long id;
	private String title;
	private String message;
	private LocalDateTime registerDate;
	
	private TopicResponse(Topic topic) {
		this.id = topic.getId();
		this.title = topic.getTitle();
		this.message = topic.getMessage();
		this.registerDate = topic.getRegisterDate();
	}
	
	public static List<TopicResponse> converter(List<Topic> topics){
		return topics.stream().map(TopicResponse::new).collect(Collectors.toList());
	}
	
}
