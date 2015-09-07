package org.lear.course.patterns.decorator;

public class AireAcondicionado extends AutoDecorator {

	public AireAcondicionado(Vendible vendible) {
		super(vendible);
	}

	@Override
	public String getDescripcion() {
		
		return this.vendible.getDescripcion() + " con aire acondicionado";
	}

	@Override
	public int getPrecio() {
		
		return this.vendible.getPrecio() + 1500;
	}
	
}
