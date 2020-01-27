package com.guames.alurarest.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Answer {

	private Long id;
	private String message;
	private Topic topic;
    @Builder.Default
	private LocalDateTime registerDate = LocalDateTime.now();
	private User author;
    @Builder.Default
	private Boolean solution = false;
}
