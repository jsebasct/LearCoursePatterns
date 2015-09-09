package org.lear.course.patterns.prototype;

public class BreadFactory implements BuildBehavior {

	@Override
	public void build() {
		System.out.println("Making bread ...");
	}

}
