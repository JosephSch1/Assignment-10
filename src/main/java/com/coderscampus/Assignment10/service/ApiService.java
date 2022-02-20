package com.coderscampus.Assignment10.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ApiService {

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public ResponseEntity getApi (String calories, String diet, String exclusions,
			String time, Class<?> responseClass) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
										.queryParam("timeFrame", time)
										.queryParam("apiKey", "4b52e5ea572345198dc198e5fbb70b42");
			if (!StringUtils.isEmpty(calories)) {
				builder = builder.queryParam("targetCalories", Integer.parseInt(calories));
			}
			if (!StringUtils.isEmpty(diet)) {
				builder = builder.queryParam("diet", diet);
			}
			if (!StringUtils.isEmpty(exclusions)) {
				builder = builder.queryParam("exclusions", exclusions);
			}
			
			URI uri = builder.build().toUri();
			RestTemplate response = new RestTemplate();
			ResponseEntity<?> responseEntity = response.getForEntity(uri, responseClass);
			return responseEntity;
	}
}
