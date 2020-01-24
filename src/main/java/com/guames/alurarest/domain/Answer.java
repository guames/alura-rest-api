package com.guames.alurarest.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Answer {

	private Long id;
	private String message;
	private Topic topic;
	private LocalDateTime registerDate = LocalDateTime.now();
	private User author;
	private Boolean solution = false;
}
