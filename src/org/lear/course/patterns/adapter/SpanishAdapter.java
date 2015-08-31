package org.lear.course.patterns.adapter;

public class SpanishAdapter implements Greetable {

	private Spanish spanish;
	
	public SpanishAdapter(Spanish spanish) {
		this.spanish = spanish;
	}
	
	@Override
	public String sayHi() {
		return this.spanish.decirHola();
	}

}
