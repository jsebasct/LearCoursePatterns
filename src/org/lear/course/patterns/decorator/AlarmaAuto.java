package org.lear.course.patterns.decorator;

public class AlarmaAuto extends AutoDecorator {

	public AlarmaAuto(Vendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescripcion() {
		return this.vendible.getDescripcion() + " con alarma";
	}

	@Override
	public int getPrecio() {
		return this.vendible.getPrecio() + 1000;
	}

}
