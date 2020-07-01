package com.microservice.coursecatalogueservice.resource;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

//	For an setup with 100's of instance of each service you can control load balacne by using discoverclient
//	@Autowired
//	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/catalogue/{userName}")
	public List<Catalogue> getCatalogue(@PathVariable String userName){
		
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("java");
		keywords.add("maven");
		keywords.add("spring-boot");
		keywords.add("microservices");
		
		
		UserRating ratings=restTemplate.getForObject("http://course-rating-service/api/ratingsByUser/"+userName,UserRating.class);
		
		List<Catalogue> cat=new ArrayList<Catalogue>();
		
		for(RatingData r:ratings.getUserRatings()){
			Course course = restTemplate.getForObject("http://course-info-service/api/course/"+r.getCourseId(), Course.class);
			cat.add(new Catalogue(course.getName(), "Courses on java", "Java", keywords, r.getRating(), course.getAuthor()));
		}
		return cat;
		
		
//		return Collections.singletonList(new Catalogue("Introduction to java", "Introductory java course", "java",keywords , 5, "akhil"));
	}
}
