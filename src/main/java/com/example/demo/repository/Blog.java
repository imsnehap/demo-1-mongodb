package com.example.demo.repository;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "blog")
public class Blog {
	
	@Field("author_id")
	private String authorId;
	private String title;
	private String content;
	
	public Blog(String authorId, String title, String content) {
		this.authorId = authorId;
		this.title = title;
		this.content = content;
	}
	
	
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
