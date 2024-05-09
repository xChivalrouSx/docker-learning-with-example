package com.chivalrous.dockerfirstproject.service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.chivalrous.dockerfirstproject.model.Value;
import com.chivalrous.dockerfirstproject.repository.ValueRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ValueService {

	private final ValueRepository valueRepository;

	public Value getValue(String id) {
		return valueRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

}
