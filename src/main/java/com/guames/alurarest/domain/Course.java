package com.guames.alurarest.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Course {
	
	private Long id;
	private String name;
	private String category;
}
