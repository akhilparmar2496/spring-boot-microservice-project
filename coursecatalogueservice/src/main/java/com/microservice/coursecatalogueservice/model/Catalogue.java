package com.microservice.coursecatalogueservice.model;

import java.util.List;

public class Catalogue {
	private String name;
	private String description;
	private String technology;
	private List<String> keywords;
	private String author;

	public Catalogue(String name, String description, String technology,
			List<String> keywords, int rating, String author) {
		super();
		this.name = name;
		this.description = description;
		this.technology = technology;
		this.keywords = keywords;
		this.rating = rating;
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	private int rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
