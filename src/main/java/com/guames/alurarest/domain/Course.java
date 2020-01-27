package com.guames.alurarest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Course {
	
	private Long id;
	private String name;
	private String category;
}
