package com.guames.alurarest.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class User {

	private Long id;
	private String name;
	private String email;
	private String login;
	private String password;
}
