package com.chivalrous.dockerfirstproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chivalrous.dockerfirstproject.model.Value;

public interface ValueRepository extends MongoRepository<Value, String> {

}
