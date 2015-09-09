package org.lear.course.patterns.prototype;

import java.util.List;

public abstract class Composable implements CityElement {
	
	protected List<CityElement> elements;
	
	public abstract void addElement(CityElement element);
	
	protected CityFactory cityFactory;
}
