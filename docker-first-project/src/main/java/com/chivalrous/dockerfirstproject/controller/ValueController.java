package com.chivalrous.dockerfirstproject.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chivalrous.dockerfirstproject.model.Value;
import com.chivalrous.dockerfirstproject.service.ValueService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("values")
@RequiredArgsConstructor
public class ValueController {

	private final ValueService valueService;

	@GetMapping("/{id}")
	public ResponseEntity<Value> getValue(@PathVariable String id) {
		return ResponseEntity.ok().body(valueService.getValue(id));
	}

	@GetMapping("/all")
	public ResponseEntity<List<Value>> getAllValues() {
		return ResponseEntity.ok().body(valueService.getAllValues());
	}

}
