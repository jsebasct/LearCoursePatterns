package org.lear.course.patterns.prototype;

import java.util.HashMap;

public class CityRegistry {

	private Park smallPark;
	private Park mediumSizedPark;
	private Park largePark;
	
	private HashMap<String, Park> cityElements;
	
	public CityRegistry() {
		smallPark = new Park(6, 4);
		mediumSizedPark = new Park(8, 6);
		largePark = new Park(16, 20);
		
		cityElements = new HashMap<>();
		cityElements.put("small_park", smallPark);
		cityElements.put("medium_park", mediumSizedPark);
		cityElements.put("large_park", largePark);
	}
	
	public CityElement getPark(String cityElement) {
		Park x = (Park)cityElements.get(cityElement);
		try {
			return (CityElement) (x.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
