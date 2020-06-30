package com.microservice.courseratingdataservice.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.courseratingdataservice.model.RatingData;
import com.microservice.courseratingdataservice.model.UserRating;

@RestController
@RequestMapping("/api")
public class CourseDataResource {
	
	@RequestMapping("/courseDataService/{courseId}")
	public RatingData getRating(@PathVariable("courseId") String courseId){
		return new RatingData(courseId,5);
	}
	
	@RequestMapping("/ratingsByUser/{userName}")
	public UserRating getRatingbyUser(@PathVariable("userName") String userName){
		List<RatingData> ratings=new ArrayList<RatingData>();
		ratings.add(new RatingData("121", 4));
		ratings.add(new RatingData("122", 3));
		ratings.add(new RatingData("123", 4));
		ratings.add(new RatingData("124", 5));
		ratings.add(new RatingData("125", 3));
		
		UserRating userRating=new UserRating();
		userRating.setUserRatings(ratings);
		return userRating;

	}

}
