package org.lear.course.patterns.adapter;

public class FrancesAdapter implements Greetable {
	private Frances frances;

	public FrancesAdapter(Frances frances) {
		this.frances = frances;
	}
	
	@Override
	public String sayHi() {
		
		return frances.salute();
	}
	
	
}
