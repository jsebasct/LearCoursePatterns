package org.lear.course.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * A park is a city element composed by green zones and games.
 * 
 * @author jscruz
 */
public class Park implements CityElement {
	
	private String name;

	private List<GreenZone> greenZones;
	private List<Game> games;
	
	public Park(int greenZonesQuantity, int gamesQuantity) {
		greenZones = new ArrayList<>();
		for (int i = 0; i < greenZonesQuantity; i++) {
			greenZones.add(new GreenZone((int) (Math.random()*10)));
		}
		
		games = new ArrayList<>();
		for (int i = 0; i < gamesQuantity; i++) {
			games.add(new Game());
		}
	}
	
	public int getGamesNumber() {
		return games.size();
	}
	
	public int getGreenZonesNumber() {
		return greenZones.size();
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
}
