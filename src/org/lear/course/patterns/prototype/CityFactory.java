package org.lear.course.patterns.prototype;

public class CityFactory implements CityElement {

	private BuildBehavior buildBehavior;
	
	public CityFactory() {
		buildBehavior = new BrickBehavior();
	}
	
	public void setBuildBehavior(BuildBehavior buildBehavior) {
		this.buildBehavior = buildBehavior; 
	}
	
	public BuildBehavior getBuildBehavior() {
		return this.buildBehavior;
	}
	
	public void build() {
		buildBehavior.build();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
