package org.lear.course.patterns.prototype;

public class IndustryArea extends Composable {

	/**
	 * Builds a Industry Area with a factory with an bread behavior
	 */
	public IndustryArea() {
		this.cityFactory = new CityFactory();
		this.cityFactory.setBuildBehavior(new BreadFactory());
	}
	
	/**
	 * Builds a Industry Area with a factory with an specific behavior
	 * @param buildable
	 */
	public IndustryArea(BuildBehavior buildable) {
		this.cityFactory = new CityFactory();
		this.cityFactory.setBuildBehavior(buildable);
	}
	
	@Override
	public void addElement(CityElement element) {
		elements.add(element);
	}

	public CityFactory getCityFactory() {
		return this.cityFactory;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public void generateResource() {
		System.out.println("Industry Area producing...");
		this.cityFactory.build();
	}
	
//	public void setCityFactory(CityFactory cityFactory) {
//		this.cityFactory = cityFactory;
//	}
	
	
}
