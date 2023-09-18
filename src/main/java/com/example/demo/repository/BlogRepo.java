package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogRepo extends MongoRepository<Blog, Integer> {
	
	

}
