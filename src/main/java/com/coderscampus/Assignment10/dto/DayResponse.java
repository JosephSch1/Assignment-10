package com.coderscampus.Assignment10.dto;

import java.util.List;

public class DayResponse {
	
	private List<Meals> meals;
	private Nutrients nutrients;
	
	public List<Meals> getMeals() {
		return meals;
	}
	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	
}
