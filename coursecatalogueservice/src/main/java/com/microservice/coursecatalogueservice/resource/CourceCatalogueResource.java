package com.microservice.coursecatalogueservice.resource;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.coursecatalogueservice.model.Catalogue;
import com.microservice.coursecatalogueservice.model.Course;
import com.microservice.coursecatalogueservice.model.RatingData;
import com.microservice.coursecatalogueservice.model.UserRating;

@RestController
@RequestMapping("/api")
public class CourceCatalogueResource {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/catalogue/{userName}")
	public List<Catalogue> getCatalogue(@PathVariable String userName){
		
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("java");
		keywords.add("maven");
		keywords.add("spring-boot");
		keywords.add("microservices");
		
		
		UserRating ratings=restTemplate.getForObject("http://localhost:8083/api/ratingsByUser/"+userName,UserRating.class);
		
		List<Catalogue> cat=new ArrayList<Catalogue>();
		
		for(RatingData r:ratings.getUserRatings()){
			Course course = restTemplate.getForObject("http://localhost:8082/api/course/"+r.getCourseId(), Course.class);
			cat.add(new Catalogue(course.getName(), "Courses on java", "Java", keywords, r.getRating(), course.getAuthor()));
		}
		return cat;
		
		
//		return Collections.singletonList(new Catalogue("Introduction to java", "Introductory java course", "java",keywords , 5, "akhil"));
	}
}
