package org.lear.course.patterns.prototype;

import java.util.HashMap;

public class CityRegistry {

	private Park smallPark;
	private Park mediumSizedPark;
	private Park largePark;
	
	private IndustryArea smallIndustryArea;
	
	private HashMap<String, CityElement> cityElements;
	
	public CityRegistry() {
		
		// parks
		smallPark = new Park(6, 4);
		mediumSizedPark = new Park(8, 6);
		largePark = new Park(16, 20);
		
		// industry elements
		smallIndustryArea = new IndustryArea();
		
		// adding elements
		cityElements = new HashMap<>();
		cityElements.put("small_park", smallPark);
		cityElements.put("medium_park", mediumSizedPark);
		cityElements.put("large_park", largePark);
		
		cityElements.put("small_industry", smallIndustryArea);
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
	
	public CityElement getIndustryArea(String codeName) {
		IndustryArea x = (IndustryArea)cityElements.get(codeName);
		try {
			return (CityElement) (x.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
