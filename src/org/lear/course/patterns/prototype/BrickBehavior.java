package org.lear.course.patterns.prototype;

public class BrickBehavior implements BuildBehavior {

	@Override
	public void build() {
		System.out.println("Building Bricks");
	}

}
