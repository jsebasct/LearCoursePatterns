package org.lear.course.patterns.decorator;

public abstract class AutoDecorator implements Vendible {

	protected Vendible vendible;

	public AutoDecorator(Vendible vendible) {
		this.vendible = vendible;
	}

//	public Vendible getVendible() {
//		return vendible;
//	}
//
//	public void setVendible(Vendible vendible) {
//		this.vendible = vendible;
//	}
	
}
