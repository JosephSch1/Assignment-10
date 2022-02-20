package com.coderscampus.Assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import com.coderscampus.Assignment10.service.ApiService;

@RestController
public class SpoonController {

	@Autowired
	ApiService service;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals (String calories, String diet, String exclusions) {
		return service.getApi(calories, diet, exclusions, "week", WeekResponse.class);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDailyMeals (String calories, String diet, String exclusions) {
		return service.getApi(calories, diet, exclusions, "day", DayResponse.class);
				
	}
}
