package com.guames.alurarest.controler;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guames.alurarest.domain.Course;
import com.guames.alurarest.domain.Topic;
import com.guames.alurarest.response.TopicResponse;

@RestController
@RequestMapping("/topics")
public class TopicsController {

	@GetMapping
	public List<TopicResponse> getTopics(){
		Topic topic = Topic.builder()
				.title("Titulo")
				.message("Tenho uma duvida do Curso!")
				.course(Course.builder()
						.name("Spring")
						.category("Programação")
						.build())
				.build();
		return TopicResponse.converter(Arrays.asList(topic, topic, topic));
	}
}
