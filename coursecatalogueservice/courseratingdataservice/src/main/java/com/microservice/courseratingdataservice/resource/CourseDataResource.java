package com.microservice.courseratingdataservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.courseratingdataservice.model.RatingData;

@RestController
@RequestMapping("/api")
public class CourseDataResource {
	
	@RequestMapping("/courseDataService/{courseId}")
	public RatingData getRating(@PathVariable("courseId") String courseId){
		return new RatingData(courseId,5);
	}

}
