package org.lear.course.patterns.decorator;

/**
 * Realizar un diseño ejecutable que contenga un dispositivo que sea decorado con otras clases.
 * 
 * Ejemplo:
 * [Disp -> AutoDecorator] 
 * [Disp -> BarcoDecorator] 
 * [Disp -> AvionDecorator]
 * 
 * @author jscruz
 */
public class Driver {

	public static void main(String[] args) {
		Vendible autoMuranoConAlarma = new NissanMurano();
		autoMuranoConAlarma = new AlarmaAuto(autoMuranoConAlarma);
		System.out.println(autoMuranoConAlarma.getDescripcion() + " - " + autoMuranoConAlarma.getPrecio());
		
		System.out.println();
		
		Vendible pathFinderSeguro = new NissanPathFinder();
		pathFinderSeguro = new JaulaSeguridad(pathFinderSeguro);
		System.out.println(pathFinderSeguro.getDescripcion() + " - " + pathFinderSeguro.getPrecio());
	}
}
