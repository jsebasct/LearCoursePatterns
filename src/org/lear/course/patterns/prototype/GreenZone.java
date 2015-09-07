package org.lear.course.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * A green zone is a city element composed of trees.
 * 
 * @author jscruz
 */
public class GreenZone implements CityElement {
	
	private List<Tree> trees;
	
	public GreenZone(int treesQuantity) {
		trees = new ArrayList<Tree>();
		
		for (int i = 0; i < treesQuantity; i++) {
			trees.add(new Tree(i+1));
		}
	}
}
