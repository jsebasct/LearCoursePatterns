package org.lear.course.patterns.prototype;

import java.util.ArrayList;

/**
 * A green zone is a city element composed of trees.
 * 
 * @author jscruz
 */
public class GreenZone extends Composable {
	
	public GreenZone(int treesQuantity) {
		elements = new ArrayList<CityElement>();
		
		for (int i = 0; i < treesQuantity; i++) {
			elements.add(new Tree(i+1));
		}
	}

	@Override
	public void addElement(CityElement element) {
		// TODO Auto-generated method stub
		if (element instanceof Tree) {
			elements.add(element);
		}
	}
}
