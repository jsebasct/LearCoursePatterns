package org.lear.course.patterns.prototype;

import java.util.ArrayList;

public class ResidentialArea extends Composable {
	
	//private List<House> houses;
	
	public ResidentialArea() {
		elements = new ArrayList<>();
	}
	
//	public void addHouse(House house) {
//		elements.add(house);
//	}

	@Override
	public void addElement(CityElement element) {
		if (element instanceof House) {
			elements.add(element);
		}
	}
}
