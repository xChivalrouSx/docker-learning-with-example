package com.chivalrous.dockerfirstproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document("values")
@AllArgsConstructor
public class Value {

	@Id
	private String id;

	private String info;

}
