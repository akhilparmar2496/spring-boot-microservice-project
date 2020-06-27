package com.microservice.courseinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.courseinfoservice.model.Course;
import com.microservice.courseinfoservice.model.CourseLevel;

@RestController
@RequestMapping("/api")
public class CatalogueInfoResource {
	
	@RequestMapping("/course/{courseId}")
	public Course getCourseInfo(@PathVariable("courseId") String courseId){
		return new Course("Introduction to java", "Akhil", CourseLevel.BEGINEER);
		
	}

}
