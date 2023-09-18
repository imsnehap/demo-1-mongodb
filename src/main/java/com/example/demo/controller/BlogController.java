package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.Blog;
import com.example.demo.repository.BlogRepo;

@RestController
public class BlogController {

	@Autowired
	BlogRepo repo;

	
	@GetMapping("/save")
	public void saveData() {
		
		Blog b = new Blog("Sneha", "FirstBlog", "FirstBlog");
		

		
		
	}
}
