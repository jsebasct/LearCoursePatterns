package org.lear.course.patterns.decorator;

public class JaulaSeguridad extends AutoDecorator {

	public JaulaSeguridad(Vendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescripcion() {
		
		return this.vendible.getDescripcion() + " con jaula de seguridad";
	} 

	@Override
	public int getPrecio() {
		return this.vendible.getPrecio() + 1000;
	}

}
