package org.lear.course.patterns.prototype;

import java.util.ArrayList;

/**
 * A park is a city element composed by green zones and games.
 * 
 * @author jscruz
 */
public class Park extends Composable {
	
	private String name;

//	private List<GreenZone> greenZones;
//	private List<Game> games;
	
	public Park(int greenZonesQuantity, int gamesQuantity) {
		elements = new ArrayList<>();
		for (int i = 0; i < greenZonesQuantity; i++) {
			elements.add(new GreenZone((int) (Math.random()*10)));
		}
		
		//games = new ArrayList<>();
		for (int i = 0; i < gamesQuantity; i++) {
			elements.add(new Game());
		}
	}
	
	public int getGamesNumber() {
		int counter = 0;
		
		for (CityElement element : elements) {
			if (element instanceof Game) {
				counter++;
			}
		}
		
		return counter;
		
//		return games.size();
	}
	
	public int getGreenZonesNumber() {
		int counter = 0;
		
		for (CityElement element : elements) {
			if (element instanceof GreenZone) {
				counter++;
			}
		}
		
		return counter;
//		return greenZones.size();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public void addElement(CityElement element) {
		// TODO Auto-generated method stub
		if (element instanceof Game || element instanceof GreenZone) {
			this.elements.add(element);
		}
	}
}
