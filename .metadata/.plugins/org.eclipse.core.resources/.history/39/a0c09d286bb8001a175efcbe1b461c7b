package com.microservice.coursecatalogueservice.resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.coursecatalogueservice.model.Catalogue;

@RestController
@RequestMapping("/api")
public class CourceCatalogueResource {
	
	@RequestMapping("/catalogue/{userName}")
	public List<Catalogue> getCatalogue(@PathVariable String userName){
		List<String> keywords=new ArrayList<String>();
		keywords.add("java");
		keywords.add("maven");
		keywords.add("spring-boot");
		keywords.add("microservices");
		return Collections.singletonList(new Catalogue("Introduction to java", "Introductory java course", "java",keywords , 5, "akhil"));
	}

}
