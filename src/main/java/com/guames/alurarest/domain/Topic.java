package com.guames.alurarest.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Topic {

	private Long id;
	private String title;
	private String message;
    @Builder.Default
	private LocalDateTime registerDate = LocalDateTime.now();
    @Builder.Default
	private Status status = Status.NOT_ANSWERED;
	private User autor;
	private Course course;
    @Builder.Default
	private List<Answer> answers = new ArrayList<>();

	enum Status {
		ANSWERED,
		NOT_ANSWERED,
		RESOLVED,
		CLOSED;
	}
}
