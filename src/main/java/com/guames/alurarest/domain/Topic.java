package com.guames.alurarest.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Topic {

	private Long id;
	private String title;
	private String message;
	private LocalDateTime registerDate = LocalDateTime.now();
	private Status status = Status.NOT_ANSWERED;
	private User autor;
	private Course course;
	private List<Answer> answers = new ArrayList<>();

	enum Status {
		ANSWERED,
		NOT_ANSWERED,
		RESOLVED,
		CLOSED;
	}
}
