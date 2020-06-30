package com.microservice.courseratingdataservice.model;

import java.util.List;

public class UserRating {
	private List<RatingData> userRatings;

	public List<RatingData> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(List<RatingData> userRatings) {
		this.userRatings = userRatings;
	}
	

}
