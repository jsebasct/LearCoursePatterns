package org.lear.course.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class ResidentialArea implements CityElement {
	private List<House> houses;
	
	public ResidentialArea() {
		houses = new ArrayList<>();
	}
	
	public void addHouse(House house) {
		houses.add(house);
	}
}
